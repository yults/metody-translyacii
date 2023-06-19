grammar declar;
s : VAR f l SEMICOLON s | EPS;
l : COMMA f l | EPS;
f : STAR f | VAR;
STAR:'\\*';
SEMICOLON: '\\;';
COMMA: '\\,';
VAR : '[a-zA-Z][a-zA-Z0-9_]*';