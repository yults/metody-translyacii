import java.io.InputStream;
import java.text.ParseException;

public class Parser {
    private LexicalAnalyser lex;
    private String token;
    private int curNodeC = 0;
    private Tree S() throws ParseException {
        if (lex.curToken() == Token.NAME) {
            String name = token;
            token = lex.nextToken();
            Tree f = F();
            token = lex.nextToken();
            Tree l = L();
            if (lex.curToken() != Token.SEMICOLON) {
                throw new ParseException("`;` expected at pos " + lex.curPos(), lex.curPos());
            }
            token = lex.nextToken();
            Tree s = S();
            if (lex.curToken() != Token.END) {
                throw new ParseException("Eof expected at pos " + lex.curPos(), lex.curPos());
            }
            return new Tree("S", new Tree(name), f, l, new Tree("SEMICOLON"), s);
        } else if (lex.curToken() == Token.END) {
            return new Tree("S", new Tree("eps"));
        } else
            throw new ParseException("Expression expected at pos " + lex.curPos(), lex.curPos());
    }

    private Tree L() throws ParseException {
        if (lex.curToken() == Token.SEMICOLON) {
            return new Tree("L", new Tree("eps"));
        } else if (lex.curToken() == Token.COMMA) {
            token = lex.nextToken();
            Tree f = F();
            token = lex.nextToken();
            Tree l = L();
            return new Tree("L", new Tree("COMMA"), f, l);
        }
        throw new ParseException("Expected ; or , at pos " + lex.curPos(), lex.curPos());
    }

    private Tree F() throws ParseException {
        if (lex.curToken() == Token.STAR) {
            token = lex.nextToken();
            Tree f = F();
            return new Tree("F", new Tree("STAR"), f);
        } else if (lex.curToken() == Token.NAME) {
            String name = token;
            return new Tree("F", new Tree(name));
        }
        throw new ParseException("Varname is incorrect. Unexpected token at pos " + lex.curPos(), lex.curPos());
    }


    public Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyser(is);
        token = lex.nextToken();
        return S();
    }

}