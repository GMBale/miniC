package default_package;

import java.util.ArrayList;

public class CaseListLater extends Absyn{
	public CaseListLater(ArrayList<Absyn> rhs)
	{
		super("CaseListLater", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 3:
			ret.append("default:\r\n");
			ret.append(((StmtList)rhs.get(2)).printAST());
			break;
		case 5:
			ret.append("default:\r\n");
			ret.append(((StmtList)rhs.get(2)).printAST());
			ret.append("break;\r\n");
			break;
		}
		return ret.toString();
	}
}
