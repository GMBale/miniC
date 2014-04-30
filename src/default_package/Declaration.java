package default_package;

import java.util.ArrayList;

public class Declaration extends NonTerminal{
	public Declaration(ArrayList<Absyn> rhs)
	{
		super("Declaration", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(((Type)rhs.get(0)).printAST());
		ret.append(((IdentList)rhs.get(1)).printAST());
		ret.append(";");
		ret.append("\r\n");
		return ret.toString();
	}	
}
