package default_package;

import java.util.ArrayList;

public class SwitchStmt extends Absyn{
	public SwitchStmt(ArrayList<Absyn> rhs)
	{
		super("SwitchStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append("switch (");
		ret.append(((Identifier)rhs.get(2)).printAST());
		ret.append(")\r\n{\r\n");
		ret.append(((CaseList)rhs.get(5)).printAST());
		ret.append("}\r\n");
		return ret.toString();
	}
}
