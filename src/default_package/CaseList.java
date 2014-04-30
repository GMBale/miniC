package default_package;

import java.util.ArrayList;

public class CaseList extends Absyn{
	public CaseList(ArrayList<Absyn> rhs)
	{
		super("CaseList", rhs);
	}
	public CaseList()
	{
		super("CaseList", new ArrayList<Absyn>());
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 0:
			break;
		case 1:
			ret.append(((CaseListLater)rhs.get(0)).printAST());
			break;
		case 2:
			ret.append(((CaseListFormer)rhs.get(0)).printAST());
			ret.append(((CaseList)rhs.get(1)).printAST());
			break;
		}
		return ret.toString();
	}
}
