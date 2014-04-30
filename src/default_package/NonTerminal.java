package default_package;

import java.util.ArrayList;

public class NonTerminal extends Absyn{
	public NonTerminal(String Name, ArrayList<Absyn> rhs)
	{
		super(Name, rhs);
	}
	
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		int len = rhs.size();
		Absyn node = null;
		for(int i=0;i<len;i++){
			node = rhs.get(i);
			ret.append(node.printAST());
		}		
		return ret.toString();
	}	
}
