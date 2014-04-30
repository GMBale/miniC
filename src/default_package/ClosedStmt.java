package default_package;

import java.util.ArrayList;

public class ClosedStmt extends Absyn{
	public ClosedStmt(ArrayList<Absyn> rhs)
	{
		super("ClosedStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		if(rhs.get(0) instanceof Terminal){
			String Name = ((Terminal)rhs.get(0)).Name; 
			if(Name == "DO"){
				ret.append("do\r\n");
				ret.append(((Stmt)rhs.get(1)).printAST());
				ret.append("while (");
				ret.append(((Expr)rhs.get(4)).printAST());
				ret.append(");\r\n");
			}else if (Name == "IF"){
				ret.append("if (");
				ret.append(((Expr)rhs.get(2)).printAST());
				ret.append(")\r\n");
				ret.append(((ClosedStmt)rhs.get(4)).printAST());
				ret.append("else\r\n");
				ret.append(((ClosedStmt)rhs.get(6)).printAST());
			}else if (Name == "WHILE"){
				ret.append("while (");
				ret.append(((Expr)rhs.get(2)).printAST());
				ret.append(")\r\n");
				ret.append(((ClosedStmt)rhs.get(4)).printAST());
			}else if (Name == "FOR"){
				ret.append("for (");
				ret.append(((Assign)rhs.get(2)).printAST());
				ret.append("; ");
				ret.append(((Expr)rhs.get(4)).printAST());
				ret.append("; ");
				ret.append(((Assign)rhs.get(6)).printAST());
				ret.append(")\r\n");
				ret.append(((ClosedStmt)rhs.get(8)).printAST());
			}else{
				ret.append(";\r\n");
			}
		}else if(rhs.get(0) instanceof AssignStmt){
			ret.append(((AssignStmt)rhs.get(0)).printAST());
		}else if(rhs.get(0) instanceof CallStmt){
			ret.append(((CallStmt)rhs.get(0)).printAST());
		}else if(rhs.get(0) instanceof RetStmt){
			ret.append(((RetStmt)rhs.get(0)).printAST());
		}else if(rhs.get(0) instanceof SwitchStmt){
			ret.append(((SwitchStmt)rhs.get(0)).printAST());
		}else if(rhs.get(0) instanceof CompoundStmt){
			ret.append(((CompoundStmt)rhs.get(0)).printAST());
		}
		return ret.toString();
	}
}
