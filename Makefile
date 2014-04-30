JFLAGS = -cp
JC = javac
target = ./tests/test.c
.SUFFIXES: .java .class
.java.class:
	$(JC) -cp ./bin/ $*.java

CLASSES = \
	./src/default_package/sym.java \
	./src/default_package/Lexer.java \
	./src/default_package/parser.java \
	./src/default_package/Main.java 

default: clean flex cup classes run
compile: flex cup classes
#	$(JC) -cp ./lib/java-cup-11a.jar ./src/default_package/sym.java


check:
	java -cp ./bin/ default_package/Main $(target)
	cp tree.txt tree2.txt
	java -cp ./bin/ default_package/Main ./tree2.txt
	diff tree.txt tree2.txt

run:
	java -cp ./bin/ default_package/Main $(target)

classes: $(CLASSES:.java=.class)

flex:
	java -jar ./lib/jflex-1.5.1.jar -d ./src/default_package/ miniC.flex

cup:
	java -jar ./lib/java-cup-11a.jar -destdir ./src/default_package/ miniC.cup

clean:
	$(RM) *.class
