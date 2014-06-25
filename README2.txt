CS420 Programming Assignment 1 2nd Step
20091540 박준영

개발환경을 windows에서 linux로 바꾸었습니다. 

Makefile 사용법

$ make target="input"

ex) $ make target=./tests/Test1
(default target=./tests/test.c)

출력결과는 tree.txt, table.txt 입니다. 

2nd step 구현내용은
Print AST    => ASTNode 클래스의 printAST()
Symbol Table => Scope.java, SymbolEntry.java, SymbolTable.java
에 있습니다. 
