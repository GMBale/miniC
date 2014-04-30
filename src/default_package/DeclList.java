package default_package;

import java.util.ArrayList;

public class DeclList extends NonTerminal{
	public DeclList(ArrayList<Absyn> rhs)
	{
		super("DeclList", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 1:
			ret.append(((Declaration)rhs.get(0)).printAST());
			break;
		case 2:
			ret.append(((DeclList)rhs.get(0)).printAST());
			ret.append(((Declaration)rhs.get(1)).printAST());
			break;
		}
		return ret.toString();
	}	
}
