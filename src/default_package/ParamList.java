package default_package;

import java.util.ArrayList;

public class ParamList extends Absyn{
	public ParamList(ArrayList<Absyn> rhs)
	{
		super("ParamList", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 2:
			ret.append(((Type)rhs.get(0)).printAST());
			ret.append(((Identifier)rhs.get(1)).printAST());
			break;
		case 4:
			ret.append(((ParamList)rhs.get(0)).printAST());
			ret.append(", ");
			ret.append(((Type)rhs.get(2)).printAST());
			ret.append(((Identifier)rhs.get(3)).printAST());
			break;
		}
		return ret.toString();
	}	
}
