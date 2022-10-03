import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        final Parser parser = new Parser();
        System.out.println(parser.parse(System.in).toString());
    }
}
