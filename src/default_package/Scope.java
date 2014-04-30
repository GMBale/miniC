package default_package;

import java.util.ArrayList;

public class Scope {
	String Name;
	Scope Parent;
	ArrayList<Scope> Children;
	int cnt_while;
	int cnt_dowhile;
	int cnt_for;
	int cnt_if;
	int cnt_else;
	int cnt_compound;
	ArrayList<SymbolEntry> Symbols; 
	
	public Scope(Scope Parent, Absyn node)
	{
		this.Parent = Parent;
		Children = new ArrayList<Scope>();
		cnt_while = 0;
		cnt_dowhile = 0;
		cnt_for = 0;
		cnt_if = 0;
		cnt_else = 0;
		cnt_compound = 0;
		Symbols = new ArrayList<SymbolEntry>();
	
		StringBuilder sb = new StringBuilder();
		if(node instanceof Program){
			sb.append("GLOBAL");
		}else if(node instanceof CompoundStmt){
			sb.append(Parent.Name);
			if(node.Parent instanceof Function){
				sb.append(" - ");
				sb.append(((Terminal)node.Parent.rhs.get(1)).value);			
			}else if(node.Parent instanceof ClosedStmt){
				Absyn gp = node.Parent.Parent;
				if(gp instanceof OpenStmt){
					sb.append(" - if(");
					sb.append(++Parent.cnt_if);
					sb.append(")");
				}else if(gp instanceof Stmt){
					Absyn ggp = gp.Parent;
					if(ggp instanceof OpenStmt){
						sb.append(" - if(");
						sb.append(++Parent.cnt_if);
						sb.append(")");
					}else if(ggp instanceof StmtList){
						sb.append(" - compound(");
						sb.append(++Parent.cnt_compound);
						sb.append(")");
					}else if(ggp instanceof ClosedStmt){
						sb.append(" - do_while(");
						sb.append(++Parent.cnt_dowhile);
						sb.append(")");
					}
				}else if(gp instanceof ClosedStmt){
					switch(node.Parent.index){
					case 4:
						if(((Terminal)gp.rhs.get(0)).Name == "WHILE"){
							sb.append(" - while(");
							sb.append(++Parent.cnt_while);
							sb.append(")");
						}else{
							sb.append(" - if(");
							sb.append(++Parent.cnt_if);
							sb.append(")");
						}
						break;
					case 6:
						sb.append(" - else(");
						sb.append(++Parent.cnt_else);
						sb.append(")");
						break;
					case 8:
						sb.append(" - for(");
						sb.append(++Parent.cnt_for);
						sb.append(")");
						break;
					}
				}
			}
		}
		this.Name = sb.toString();
	}
	
	public void AddIdentifier(String Type, Identifier node, String Role)
	{
		String Name = ((Terminal)node.rhs.get(0)).value;
		int ArraySize = 0;
		boolean isArray = false;
		if(node.rhs.size() == 4){
			isArray = true;
			ArraySize = Integer.parseInt(((Terminal)node.rhs.get(2)).value);
		}
		Symbols.add(new SymbolEntry(Type, Name, isArray, ArraySize, Role));
	}
	public void AddIdentList(String Type, IdentList node)
	{
		switch(node.rhs.size())
		{
		case 1:
			AddIdentifier(Type, (Identifier)node.rhs.get(0), "variable");
			break;
		case 3:
			AddIdentList(Type, (IdentList)node.rhs.get(0));
			AddIdentifier(Type, (Identifier)node.rhs.get(2), "variable");
			break;
		}
	}
	public void AddDeclaration(Declaration node)
	{
		String Type = ((Terminal)node.rhs.get(0).rhs.get(0)).Name;
		AddIdentList(Type, (IdentList)node.rhs.get(1));
	}
	public void AddDeclList(DeclList node)
	{
		switch(node.rhs.size())
		{
		case 1:
			AddDeclaration((Declaration)node.rhs.get(0));
			break;
		case 2:
			AddDeclList((DeclList)node.rhs.get(0));
			AddDeclaration((Declaration)node.rhs.get(1));
			break;
		}
	}
	public void AddParamList(ParamList node)
	{
		switch(node.rhs.size())
		{
		case 2:
			AddIdentifier(((Terminal)node.rhs.get(0).rhs.get(0)).Name, (Identifier)node.rhs.get(1), "parameter");
			break;
		case 4:
			AddParamList((ParamList)node.rhs.get(0));
			AddIdentifier(((Terminal)node.rhs.get(2).rhs.get(0)).Name, (Identifier)node.rhs.get(3), "parameter");
			break;
		}
	}
	public void AddFunction(Function node)
	{
		String Type = ((Terminal)node.rhs.get(0).rhs.get(0)).Name;
		String Name = ((Terminal)node.rhs.get(1)).value;
		Symbols.add(new SymbolEntry(Type, Name, false, 0, "function"));
	}	
	public void AddFuncList(FuncList node)
	{
		switch(node.rhs.size())
		{
		case 1:
			AddFunction((Function)node.rhs.get(0));
			break;
		case 2:
			AddFuncList((FuncList)node.rhs.get(0));
			AddFunction((Function)node.rhs.get(1));
			break;
		}
	}
	
	public Scope AddScope(Absyn node)
	{
		Scope newScope = new Scope(this, node);
		Children.add(newScope);
		return newScope;
	}
	
	public String printTable()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Function name : ");
		sb.append(Name);
		sb.append("\r\n");
		sb.append("count    Type                name   array        role\r\n");
		int len = Symbols.size();
		for(int i=0;i<len;i++){
			SymbolEntry sym = Symbols.get(i);
			if(sym.isArray){
				sb.append(String.format("%5s%8s%20s%8s%12s", i+1, sym.Type, sym.Name, sym.ArraySize, sym.Role));
			}else{
				sb.append(String.format("%5s%8s%20s%20s", i+1, sym.Type, sym.Name, sym.Role));
			}
			sb.append("\r\n");
		}
		sb.append("\r\n\r\n");
		len = Children.size();
		for(int i=0;i<len;i++){
			sb.append(Children.get(i).printTable());
		}
		return sb.toString();
	}
}
