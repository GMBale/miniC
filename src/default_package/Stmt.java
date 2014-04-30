package default_package;

import java.util.ArrayList;

public class Stmt extends Absyn{
	public Stmt(ArrayList<Absyn> rhs)
	{
		super("Stmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		if(rhs.get(0) instanceof OpenStmt){
			ret.append(((OpenStmt)rhs.get(0)).printAST());
		}else{
			ret.append(((ClosedStmt)rhs.get(0)).printAST());
		}
		return ret.toString();
	}
}
