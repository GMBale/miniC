package default_package;

import java.util.ArrayList;

public class OpenStmt extends Absyn{
	public OpenStmt(ArrayList<Absyn> rhs)
	{
		super("OpenStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		if(((Terminal)rhs.get(0)).Name == "IF"){
			ret.append("if (");
			ret.append(((Expr)rhs.get(2)).printAST());
			ret.append(")\r\n");
			switch(rhs.size())
			{
			case 5:
				ret.append(((Stmt)rhs.get(4)).printAST());
				break;
			case 7:
				ret.append(((ClosedStmt)rhs.get(4)).printAST());
				ret.append("else\r\n");
				ret.append(((OpenStmt)rhs.get(6)).printAST());
				break;
			}
		}else{
			ret.append(((ClosedStmt)rhs.get(0)).printAST());
		}
		return ret.toString();
	}
}
