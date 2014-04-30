package default_package;

import java.util.ArrayList;

public class Assign extends Absyn{
	public Assign(ArrayList<Absyn> rhs)
	{
		super("Assign", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 3:
			ret.append(((Terminal)rhs.get(0)).value);
			ret.append(" = ");
			ret.append(((Expr)rhs.get(2)).printAST());
			break;
		case 6:
			ret.append(((Terminal)rhs.get(0)).value);
			ret.append("[");
			ret.append(((Expr)rhs.get(2)).printAST());
			ret.append("] = ");
			ret.append(((Expr)rhs.get(5)).printAST());
			break;
		}
		return ret.toString();
	}
}
