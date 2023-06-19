grammar g;

start returns [Grammar g1] @init {$g1 = new Grammar();} :
    gHeader[$g1] header[$g1]? members[$g1]?
    (termD {$g1.addTerm($termD.term);} |
    netermD {$g1.addNeterm($netermD.neterm);})* EOF;

gHeader[Grammar g1] : GRAMMAR VAR SEMICOLON {$g1.setName($VAR.text);};
header[Grammar g1]
    locals [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    } : HEADER code[$sb] {$g1.setHeader($sb.toString());};
members[Grammar g1]
    locals [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
    } : MEMBERS code[$sb] {$g1.setMembers($sb.toString());};
code[StringBuilder sb] :
    CODE {$sb.append($CODE.text.substring(1, $CODE.text.length() - 1));} ;
params[StringBuilder sb] :
    '[' CODE ']'
    {
        String p = $CODE.text;
        $sb.append(p.substring(1, p.length() - 1));
    }
    ;
termD returns [Term term]: VAR COLON REGEX SEMICOLON {
    String rx = $REGEX.text;
    $term = new Term($VAR.text, rx.substring(1, rx.length() - 1));
};
netermD
    returns [Neterm neterm]
    locals [StringBuilder sb]
    @init {
        $sb = new StringBuilder();
        $neterm = new Neterm();
    } : VAR {$neterm.setName($VAR.text);}
    ('[' netParams[$neterm] ']')?
    (RETURNS '[' netReturns[$neterm] ']')?
    COLON
    netRule {$neterm.addRule($netRule.rule);}
    (OR netRule {$neterm.addRule($netRule.rule);})*
    SEMICOLON;
netReturns[Neterm neterm] :
    type=VAR name=VAR {$neterm.addReturn($type.text, $name.text);}
    (COMMA type=VAR name=VAR {$neterm.addReturn($type.text, $name.text);})*;

netParams[Neterm neterm] :
    type=VAR name=VAR {$neterm.addParam($type.text, $name.text);}
        (COMMA type=VAR name=VAR {$neterm.addParam($type.text, $name.text);})*;
netRule
    returns [Rule rule]
    @init {
        $rule = new Rule();
    } : (item {$rule.addItem($item.i);})+;
item
    returns [Item i]
    locals [StringBuilder sb, StringBuilder p]
    @init {
        $i = new Item();
        $sb = new StringBuilder();
        $p = new StringBuilder();
    } : VAR {$i.setName($VAR.text);}
    (params[$p] {$i.setParams($p.toString());})?
    (code[$sb] {$i.setCode($sb.toString());})?;

REGEX : '\'' (~('\'' | '\n'))+ '\'';
CODE   : '{' ((('\\{')|('\\}')|~([{}])))* '}';
GRAMMAR : 'grammar';
HEADER : '@header';
MEMBERS : '@members';
INIT : '@init';
RETURNS : 'returns';
LOCALS : 'locals';
VAR : [a-zA-Z][a-zA-Z0-9_]*;
COMMA : ',';
OR : '|';
COLON : ':';
SEMICOLON : ';';
WHITESPACEERASE : [ \t\r\n]+ -> skip;