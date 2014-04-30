package default_package;

import java.util.ArrayList;

public class Program extends NonTerminal{
	public Program(ArrayList<Absyn> rhs)
	{
		super("Program", rhs);
	}
	public Program()
	{
		super("Program", new ArrayList<Absyn>());
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 1:
			if(rhs.get(0) instanceof DeclList){
				ret.append(((DeclList)rhs.get(0)).printAST());
			}else{
				ret.append(((FuncList)rhs.get(0)).printAST());
			}
			break;
		case 2:
			ret.append(((DeclList)rhs.get(0)).printAST());
			ret.append(((FuncList)rhs.get(1)).printAST());
			break;
		}
		return ret.toString();
	}	
}
