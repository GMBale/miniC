package default_package;

import java.util.ArrayList;

public class StmtList extends Absyn{
	public StmtList(ArrayList<Absyn> rhs)
	{
		super("StmtList", rhs);
	}
	public StmtList()
	{
		super("StmtList", new ArrayList<Absyn>());
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size())
		{
		case 0:
			break;
		case 2:
			ret.append(((StmtList)rhs.get(0)).printAST());
			ret.append(((Stmt)rhs.get(1)).printAST());
			break;
		}
		return ret.toString();
	}
}
