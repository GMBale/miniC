package default_package;

import java.util.ArrayList;

public class IdentList extends Absyn{
	public IdentList(ArrayList<Absyn> rhs)
	{
		super("IdentList", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 1:
			ret.append(((Identifier)rhs.get(0)).printAST());
			break;
		case 3:
			ret.append(((IdentList)rhs.get(0)).printAST());
			ret.append(", ");
			ret.append(((Identifier)rhs.get(2)).printAST());
			break;
		}
		return ret.toString();
	}	
}
