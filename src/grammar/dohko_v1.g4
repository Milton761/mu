grammar dohko_v1;

// Parser Rules
root: composable
    | layout
    ;

layout: box
      | column
      ;

box: 'Box' '(' attributeList ')' ('{' contentList '}')?;
column: 'Column' '(' attributeList ')' ('{' contentList '}')?;

attributeList:
    | attribute attributeList
    ;

contentList:
    | contentItem contentList
    ;

contentItem: composable;

composable: materialComponent
          | layout
          ;

materialComponent: componentName '(' attributeList ')' ('{' contentList '}')?;

componentName: 'Text'
             | 'Image'
             | 'Button'
             ;

attribute: IDENTIFIER ':' value ','?;

value: STRING
     | NUMBER
     | BOOLEAN
     | COLOR
     | DIMENSION
     | ACTION
     | IDENTIFIER
     | array
     | templateExpression
     ;

templateExpression: '${' IDENTIFIER ('.' IDENTIFIER)* '}';

array: '[' arrayElements ']';

arrayElements:
    | value (',' value)*
    ;

// Lexer Rules
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
STRING: '"' (~["\r\n] | '\\"')* '"';
NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
BOOLEAN: 'true' | 'false';
COLOR: '#' [0-9a-fA-F]+;
DIMENSION: NUMBER ('dp' | 'sp' | 'px' | '%');
ACTION: '@' IDENTIFIER;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;