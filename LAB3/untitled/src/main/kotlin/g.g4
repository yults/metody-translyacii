grammar g;

//Главная структура
file: include* namespace main EOF;
include: INCLUDE LA VARAIBLE RA ;
namespace: USING NAMESPACE VARAIBLE SEMICOLON;
main: INT MAIN LR RR LF body* RF;

//тело
body: cin | if1 | return1 | for | varr | var2;

varr: type var1 (COMMA var1)* SEMICOLON;
var1: VARAIBLE is1?;
var2: VARAIBLE is1? SEMICOLON;
is1: IS value;
value: STRING | bool | NUM | VARAIBLE | expr;
expr: NUM op NUM;
op: PlUSIK | MINUS | MUL | DIV | MOD;
if1: IF bool LF body* RF else1?;
else1: ELSE LF body* RF;
cin: CIN ravar* SEMICOLON;
ravar: RAA VARAIBLE;
for: FOR LR type var1 SEMICOLON condition SEMICOLON VARAIBLE step RR LF body* RF;
return1: RETURN value SEMICOLON;

//Объединенные классы типа ИЛИ
type: INT | DOUBLE | FLOAT | LONG | SHORT | BOOLEAN | STRING | CHART;
cmp: EQ | NOTEQ | LA | RA | BETTEREQ | LESSEQ | AND | OR;
bool: TRUE | FALSE | NOT bool | condition | LR bool RR;

//comparison: value cmp value;
condition: cmprble cmp cmprble;
cmprble: TRUE | FALSE | VARAIBLE | NUM | STRING;
step: PP | MM;

//Словечки для обяъвлений
USING: 'using';
NAMESPACE: 'namespace';
//STD: 'std';
INCLUDE: '#include';
CIN: 'cin';
COUT: 'cout';
MAIN: 'main';
//Конструкции
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';
//Арифметика
PlUSIK: '+';
MINUS:'-';
MUL: '*';
DIV: '/';
MOD: '%';
//Скобки
LR: '(';
RR: ')';
LF: '{';
RF: '}';
LSQ: '[';
RSQ: ']';
RAA: '>>';
LA: '<';
RA: '>';
//Разделители
COMMA: ',';
DOTT: '.';
SEMICOLON: ';';
COLON: ':';
//Сравнение
BETTEREQ: '>=';
LESSEQ: '<=';
EQ: '==';
NOTEQ: '!=';
IS: '=';
OR: '||';
AND: '&&';
NOT: '!';
TRUE: 'true';
FALSE: 'false';
//Типы
INT: 'int';
DOUBLE: 'double';
FLOAT: 'float';
LONG: 'long';
SHORT: 'short';
BOOLEAN: 'bool';
CHART: 'char';
VOID: 'void';
//step
PP: '++';
MM: '--';
// Строки и числа
fragment CHAR: 'a' .. 'z' | ' ' | 'A' .. 'Z';
fragment VAR: [a-zA-Z] [a-zA-Z0-9_]*;
fragment DIGIT : [0-9];
fragment CharFr: ~["\\\r\n];
NUM: (DIGIT+ | DIGIT+ '.' DIGIT+);
STRING: '"' (CharFr | CHAR)* '"';
VARAIBLE: VAR;
//Skip
WS: [ \t]+ -> skip;
NL: [\n\r]+ -> skip;
