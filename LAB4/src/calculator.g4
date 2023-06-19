grammar calculator;
@header {import java.lang.Integer.parseInt;}

start
    : expr {println(expr_valp$)}
    ;

expr returns [int valp]
    : mulDiv addSubP[{mulDiv_valp}] {valp$ = addSubP_valp$}
    ;

addSubP [int i] returns [int valp]
    : EPS {valp$ = i$}
    | PLUS expr[{i + mulDiv_valp}]  {valp$ = expr_valp$}
    | MINUS expr[{mulDiv_valp - i}] {valp$ = expr_valp$}
    ;

mulDiv returns [int valp]
    : unary mulDivP[{unary_valp}] {valp$ = mulDivP_valp$}
    ;

mulDivP [int i] returns [int valp]
    : EPS {valp$ = i$}
    | MUL unary mulDivP[{i * unary_valp}] {valp$ = mulDivP_valp$}
    | DIV unary mulDivP[{i / unary_valp}] {valp$ = mulDivP_valp$}
    ;

unary returns [int valp]
    : LR expr RR {valp$ = expr_valp$}
    | NUMBER {valp$ = parseInt(NUMBER_text$)};

LR : '\\(';
RR : '\\)';
PLUS : '\\+';
MINUS : '\\-';
MUL : '\\*';
DIV : '\\/';
NUMBER : '[1-9][0-9]*';