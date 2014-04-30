package default_package;

import java.util.ArrayList;

public class CompoundStmt extends Absyn{
	public CompoundStmt(ArrayList<Absyn> rhs)
	{
		super("CompoundStmt", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		switch(rhs.size()){
		case 3:
			ret.append("{\r\n");
			ret.append(((StmtList)rhs.get(1)).printAST());
			ret.append("}\r\n");
			break;
		case 4:
			ret.append("{\r\n");
			ret.append(((DeclList)rhs.get(1)).printAST());
			ret.append(((StmtList)rhs.get(2)).printAST());
			ret.append("}\r\n");
			break;
		}
		return ret.toString();
	}
}
