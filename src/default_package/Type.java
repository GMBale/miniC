package default_package;

import java.util.ArrayList;

public class Type extends Absyn{
	public Type(ArrayList<Absyn> rhs)
	{
		super("Type", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		ret.append(((Terminal)rhs.get(0)).printAST());
		ret.append(" ");
		return ret.toString();
	}	
}
