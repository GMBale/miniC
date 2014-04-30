package default_package;

import java.util.ArrayList;

public class Call extends Absyn{
	public Call(ArrayList<Absyn> rhs)
	{
		super("Call", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 3:
			ret.append(((Terminal)rhs.get(0)).value);
			ret.append("()");
			break;
		case 4:
			ret.append(((Terminal)rhs.get(0)).value);
			ret.append("(");
			ret.append(((ArgList)rhs.get(2)).printAST());
			ret.append(")");
			break;
		}
		return ret.toString();
	}
}