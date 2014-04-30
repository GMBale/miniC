package default_package;

import java.util.ArrayList;

public class Identifier extends Absyn{
	public Identifier(ArrayList<Absyn> rhs)
	{
		super("Identifier", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(((Terminal)rhs.get(0)).printAST());
		switch(rhs.size()){
		case 1:
			break;
		case 4:
			ret.append("[");
			ret.append(((Terminal)rhs.get(2)).printAST());
			ret.append("]");
			break;
		}
		return ret.toString();
	}	
}
