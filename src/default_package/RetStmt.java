package default_package;

import java.util.ArrayList;

public class RetStmt extends Absyn{
	public RetStmt(ArrayList<Absyn> rhs)
	{
		super("RetStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 2:
			ret.append("return;\r\n");
			break;
		case 3:
			ret.append("return ");
			ret.append(((Expr)rhs.get(1)).printAST());
			ret.append(";\r\n");
			break;
		}
		return ret.toString();
	}	
}
