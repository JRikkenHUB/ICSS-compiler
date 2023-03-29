grammar ICSS;

//--- LEXER: ---

// IF support:
IF: 'if';
ELSE: 'else';
BOX_BRACKET_OPEN: '[';
BOX_BRACKET_CLOSE: ']';


//Literals
TRUE: 'TRUE';
FALSE: 'FALSE';
PIXELSIZE: [0-9]+ 'px';
PERCENTAGE: [0-9]+ '%';
SCALAR: [0-9]+;


//Color value takes precedence over id idents
COLOR: '#' [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f];

//Specific identifiers for id's and css classes
ID_IDENT: '#' [a-z0-9\-]+;
CLASS_IDENT: '.' [a-z0-9\-]+;

//General identifiers
LOWER_IDENT: [a-z] [a-z0-9\-]*;
CAPITAL_IDENT: [A-Z] [A-Za-z0-9_]*;

//All whitespace is skipped
WS: [ \t\r\n]+ -> skip;

//
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
SEMICOLON: ';';
COMMA : ',';
COLON: ':';
PLUS: '+';
MIN: '-';
MUL: '*';
ASSIGNMENT_OPERATOR: ':=';




//--- PARSER: ---
stylesheet: varName* cssRule* EOF;
cssRule: selector OPEN_BRACE ruleBody CLOSE_BRACE;
ruleDeclaration: propName COLON expression SEMICOLON;
propName: LOWER_IDENT;

varName: varReference ASSIGNMENT_OPERATOR expression+ SEMICOLON;

ifStatement: IF BOX_BRACKET_OPEN (varReference | boolVar) BOX_BRACKET_CLOSE OPEN_BRACE ruleBody CLOSE_BRACE elseStatement?;
elseStatement: ELSE OPEN_BRACE ruleBody CLOSE_BRACE;

expression: litExpression | expression (MUL) expression | expression (PLUS | MIN) expression;

boolVar: TRUE | FALSE;
colorVar: COLOR;
percentageVar: PERCENTAGE;
pixelVar: PIXELSIZE;
scalarVar: SCALAR;
varReference: CAPITAL_IDENT;
litExpression: boolVar | colorVar | percentageVar | pixelVar | scalarVar | varReference;

classPicker: CLASS_IDENT;
tagPicker: LOWER_IDENT;
idPicker: ID_IDENT | COLOR;
selector: (tagPicker | classPicker | idPicker) (COMMA selector)*;

ruleBody: (ruleDeclaration | ifStatement | varName)*;

