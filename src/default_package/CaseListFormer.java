package default_package;

import java.util.ArrayList;

public class CaseListFormer extends Absyn{
	public CaseListFormer(ArrayList<Absyn> rhs)
	{
		super("CaseListFormer", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 4:
			ret.append("case ");
			ret.append(((Terminal)rhs.get(1)).printAST());
			ret.append(":\r\n");
			ret.append(((StmtList)rhs.get(3)).printAST());
			break;
		case 6:
			ret.append("case ");
			ret.append(((Terminal)rhs.get(1)).printAST());
			ret.append(":\r\n");
			ret.append(((StmtList)rhs.get(3)).printAST());
			ret.append("break;\r\n");
			break;
		}
		return ret.toString();
	}
}
