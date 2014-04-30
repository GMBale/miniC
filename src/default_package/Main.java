package default_package;
/*
  This example comes from a short article series in the Linux 
  Gazette by Richard A. Sevenich and Christopher Lopes, titled
  "Compiler Construction Tools". The article series starts at

  http://www.linuxgazette.com/issue39/sevenich.html

  Small changes and updates to newest JFlex+Cup versions 
  by Gerwin Klein
*/

/*
  Commented By: Christopher Lopes
  File Name: Main.java
  To Create: 
  After the scanner, lcalc.flex, and the parser, ycalc.cup, have been created.
  > javac Main.java
  
  To Run: 
  > java Main test.txt
  where test.txt is an test input file for the calculator.
*/
   
import java.io.*;
   
public class Main {
	static public void main(String argv[]) {    
		/* Start the parser */
		try {
			FileReader fr = new FileReader(argv[0]);
			Lexer lex = new Lexer(fr);
			parser p = new parser(lex);
			Absyn.out = new BufferedWriter(new FileWriter("ProductionRule.txt"));
			Absyn result = (Absyn)p.parse().value;
			Absyn.out.close();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("tree.txt"));
			bw.write(((Program)result).printAST());
			bw.flush();
			bw.close();
			
			Scope global = new Scope(null, result);
			SymbolTable.TraverseSymbol(global, result);
			bw = new BufferedWriter(new FileWriter("table.txt"));
			bw.write(global.printTable());
			bw.flush();
			bw.close();
		} catch (Exception e) {
			/* do cleanup here -- possibly rethrow e */
			e.printStackTrace();
		}
	}
}


