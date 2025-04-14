grammar g;


// Парсерные правила
program: statement+;

statement: usingStatement | foreachStatement | whileStatement | forStatement | createStatement | generateStatement | outputStatement;

usingStatement: 'using' (namespace | assignment) ';';

namespace: ID ('.' ID)*;

assignment: ID '=' value;

value: INT | ID;

foreachStatement: 'foreach' ID '.' ID '.' ID '{' action '}';

action: 'include' ID 'into' ID ';';

whileStatement: 'while' '(' condition ')' '{' statement+ '}';

condition: ID '!=' ID;

forStatement: 'for' '(' ID ')' '{' statement+ '}';

createStatement: 'create' 'Person' ID '{' attribute+ '}';

attribute: ID '(' attributeValue ')' ';';

attributeValue: ID | INT | STRING | timeRange | weights | diet | allergy;

timeRange: '{' 'Busy' '(' time (',' time)* ')' '}';

time: timePart '-' timePart;

timePart: INT 'AM' | INT 'PM';

weights: '{' '//' 'here' 'will' 'be' 'chosen' 'weights' 'for' 'sport' '}';

diet: 'Standard';

allergy: ID '.' ID;

generateStatement: 'generate' ID '(' parameter (',' parameter)* ')' ';';

parameter: ID 'avg' | ID 'avg_not_specified' | ID 'w_gear_not_specified' | ID | ID '=' ID;

outputStatement: 'output' ID ('.' ID)* ('as' ID ID)? ';';

// Лексерные правила
ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;