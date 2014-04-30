package default_package;

import java.util.ArrayList;

public class Expr extends Absyn{
	public Expr(ArrayList<Absyn> rhs)
	{
		super("Expr", rhs);
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		int len = rhs.size();
		for(int i=0; i < len; i++){
			if(rhs.get(0) instanceof Expr && i > 0) ret.append(" ");
			if(rhs.get(i) instanceof Terminal){
				ret.append(((Terminal)rhs.get(i)).printAST());
			}else if(rhs.get(i) instanceof Call){
				ret.append(((Call)rhs.get(i)).printAST());
			}else{
				ret.append(((Expr)rhs.get(i)).printAST());
			}
		}
		return ret.toString();
	}
}
