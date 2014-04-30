package default_package;
  
import java_cup.runtime.*;
      
%%
%class Lexer

%line
%column
    
%cup
   
eqop = ==|\!= 
relop = <|>|<=|>=
muldiv = \*|\/

id = [A-Za-z][A-Za-z0-9_]*
intnum = [0-9]+
floatnum = [0-9]+\.[0-9]+
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator}|[ \t\f]


%%
<YYINITIAL> {
    "+"     { System.out.print(" + "); return new Symbol(sym.PLUS, yyline+1, yycolumn+1); }
    "-"     { System.out.print(" - "); return new Symbol(sym.MINUS, yyline+1, yycolumn+1); }
    "("     { System.out.print(" ( "); return new Symbol(sym.LPAREN, yyline+1, yycolumn+1); }
    ")"     { System.out.print(" ) "); return new Symbol(sym.RPAREN, yyline+1, yycolumn+1); }
    "{"     { System.out.print(" { "); return new Symbol(sym.LCBRACKET, yyline+1, yycolumn+1); }
    "}"     { System.out.print(" } "); return new Symbol(sym.RCBRACKET, yyline+1, yycolumn+1); }
    "["     { System.out.print(" [ "); return new Symbol(sym.LSBRACKET, yyline+1, yycolumn+1); }
    "]"     { System.out.print(" ] "); return new Symbol(sym.RSBRACKET, yyline+1, yycolumn+1); }
    ","     { System.out.print(" , "); return new Symbol(sym.COMMA, yyline+1, yycolumn+1); }
    "="     { System.out.print(" = "); return new Symbol(sym.ASSIGN, yyline+1, yycolumn+1); }
    ";"     { System.out.print(" ; "); return new Symbol(sym.SEMI, yyline+1, yycolumn+1); }
    ":"     { System.out.print(" : "); return new Symbol(sym.COLON, yyline+1, yycolumn+1); }

    "int"        { System.out.print(" int "); return new Symbol(sym.INT, yyline+1, yycolumn+1); }
    "float"      { System.out.print(" float "); return new Symbol(sym.FLOAT, yyline+1, yycolumn+1); }
    "return"     { System.out.print(" return "); return new Symbol(sym.RETURN, yyline+1, yycolumn+1); }
    "do"         { System.out.print(" do "); return new Symbol(sym.DO, yyline+1, yycolumn+1); }
    "while"      { System.out.print(" while "); return new Symbol(sym.WHILE, yyline+1, yycolumn+1); }
    "for"        { System.out.print(" for "); return new Symbol(sym.FOR, yyline+1, yycolumn+1); }
    "if"         { System.out.print(" if "); return new Symbol(sym.IF, yyline+1, yycolumn+1); }
    "else"       { System.out.print(" else "); return new Symbol(sym.ELSE, yyline+1, yycolumn+1); }
    "switch"     { System.out.print(" switch "); return new Symbol(sym.SWITCH, yyline+1, yycolumn+1); }
    "case"       { System.out.print(" case "); return new Symbol(sym.CASE, yyline+1, yycolumn+1); }
    "break"      { System.out.print(" break "); return new Symbol(sym.BREAK, yyline+1, yycolumn+1); }
    "default"    { System.out.print(" default "); return new Symbol(sym.DEFAULT, yyline+1, yycolumn+1); }

    {muldiv} { System.out.print(yytext()); return new Symbol(sym.MULDIV, yyline+1, yycolumn+1, new String(yytext())); }
    {relop} { System.out.print(yytext()); return new Symbol(sym.REL, yyline+1, yycolumn+1, new String(yytext())); }
    {eqop} { System.out.print(yytext()); return new Symbol(sym.EQ, yyline+1, yycolumn+1, new String(yytext())); }

    {id} { System.out.print(yytext()); return new Symbol(sym.ID, yyline+1, yycolumn+1, new String(yytext())); }
    {intnum} { System.out.print(yytext()); return new Symbol(sym.INTNUM, yyline+1, yycolumn+1, new Integer(yytext())); }
    {floatnum} { System.out.print(yytext()); return new Symbol(sym.FLOATNUM, yyline+1, yycolumn+1, new Float(yytext())); }
    {LineTerminator}       {System.out.println();}
    {WhiteSpace}       {}   
}
[^]                    { throw new Error("Illegal character <"+yytext()+"> [Line:Column]=["+yyline+1+", "+yycolumn+1 ); }

