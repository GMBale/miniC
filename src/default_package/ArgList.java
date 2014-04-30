package default_package;

import java.util.ArrayList;

public class ArgList extends Absyn{
	public ArgList(ArrayList<Absyn> rhs)
	{
		super("ArgList", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 1:
			ret.append(((Expr)rhs.get(0)).printAST());
			break;
		case 3:
			ret.append(((ArgList)rhs.get(0)).printAST());
			ret.append(", ");
			ret.append(((Expr)rhs.get(2)).printAST());
			break;
		}
		return ret.toString();
	}
}
