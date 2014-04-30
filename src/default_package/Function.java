package default_package;

import java.util.ArrayList;

public class Function extends NonTerminal{
	public Function(ArrayList<Absyn> rhs)
	{
		super("Function", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(((Type)rhs.get(0)).printAST());
		ret.append(((Terminal)rhs.get(1)).printAST());
		ret.append("(");
		switch(rhs.size()){
		case 5:
			ret.append(")");
			ret.append("\r\n");
			ret.append(((CompoundStmt)rhs.get(4)).printAST());
			break;
		case 6:
			ret.append(((ParamList)rhs.get(3)).printAST());
			ret.append(")");
			ret.append("\r\n");
			ret.append(((CompoundStmt)rhs.get(5)).printAST());
			break;
		}
		return ret.toString();
	}	
}
