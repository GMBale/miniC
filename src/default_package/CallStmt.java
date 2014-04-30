package default_package;

import java.util.ArrayList;

public class CallStmt extends Absyn{
	public CallStmt(ArrayList<Absyn> rhs)
	{
		super("CallStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(((Call)rhs.get(0)).printAST());
		ret.append(";\r\n");
		return ret.toString();
	}	
}
