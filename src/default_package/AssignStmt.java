package default_package;

import java.util.ArrayList;

public class AssignStmt extends Absyn{
	public AssignStmt(ArrayList<Absyn> rhs)
	{
		super("AssignStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(((Assign)rhs.get(0)).printAST());
		ret.append(";\r\n");
		return ret.toString();
	}
}
