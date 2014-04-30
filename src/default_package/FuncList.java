package default_package;

import java.util.ArrayList;

public class FuncList extends Absyn{
	public FuncList(ArrayList<Absyn> rhs)
	{
		super("FuncList", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 1:
			ret.append(((Function)rhs.get(0)).printAST());
			break;
		case 2:
			ret.append(((FuncList)rhs.get(0)).printAST());
			ret.append(((Function)rhs.get(1)).printAST());
			break;
		}
		return ret.toString();
	}
}
