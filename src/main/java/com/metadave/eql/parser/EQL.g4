grammar EQL;

stmts: connect_stmt? query_stmt*;

connect_stmt      :  CONNECT clusterName=ID? hps+=hostport (COMMA hps+=hostport)* SEMI;

// TODO: NOT REALLY A HOSTNAME REGEX!
hostport          : host=ID ':' port=INT;

query_stmt        :   QUERY key=ID field_list?  filter_stmt? return_stmt? sort_stmt? SEMI;

field_list        : LPAREN fields+=ID (COMMA fields+=ID)* RPAREN;

filter_stmt       :   'filter' filter_pred;

filter_pred       : name=ID '=' (intval=INT | stringval=STRING) filter_rest?
                    | LPAREN childpred=filter_pred RPAREN;

// as far as I can tell, you can't combine ANDs with ORs etc UNLESS
// you nest the bool filter
filter_rest :     (AND ands+=filter_pred)+
                  | (OR  ors+=filter_pred)+;
                  //TODO: just use !=? | (NOT filter_pred)*;

// antlr4 doesn't like "return" by itself, use "RETURNKW"
return_stmt       : RETURNKW size=INT? (FROM lower=INT)?;

sort_stmt         : SORT ON keys+=ID sorts+=ascdesc (COMMA keys+=ID sorts+=ascdesc)*;
ascdesc           : asc='asc' | desc='desc';

SORT        :    'sort';
CONNECT     :    'connect';
QUERY       :    'query';
ALL         :    'all';
RETURNKW    :    'return';
FROM        :    'from';
ON          :    'on';
TO          :    'to';
AND         :    'and';
OR          :    'or';
NOT         :    'not';
AT          :    '@';
DOLLAR      :    '$';
SPLAT       :    '*';
COMMA       :    ',';
LSQUARE     :    '[';
RSQUARE     :    ']';
LPAREN      :    '(';
RPAREN      :    ')';
EQUALS      :    '=';
DOT         :    '.';
SEMI        :    ';';
ID          :       LOWER (UPPER | LOWER | DIGIT | '_' | '.')*;

fragment LOWER : 'a' .. 'z';
fragment UPPER : 'A' .. 'Z';

INT             :   DIGIT+;
fragment DIGIT  : '0' .. '9';

FLOAT       :       DIGIT+ DOT DIGIT*
                    | DOT DIGIT+
                       ;

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

// scissors op, dude riding a pterodactyl, drunken bird
DATA_CONTENT: '~%~' (DATA_ESC|.)*? '~%~';
fragment DATA_ESC: '\\~%~' | '\\~%~';


LINE_COMMENT  : '//' .*? '\r'? '\n' -> skip ;
COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;
