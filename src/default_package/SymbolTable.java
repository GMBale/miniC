package default_package;

public class SymbolTable {
	public static void EachRHS(Scope scope, Absyn node)
	{
		int len = node.rhs.size();
		for(int i=0;i<len;i++){
			TraverseSymbol(scope, node.rhs.get(i));
		}
	}
	public static void TraverseSymbol(Scope scope, Absyn node)
	{
		if(node instanceof Program){
			switch(node.rhs.size()){
			case 1:
				if(node.rhs.get(0) instanceof DeclList){
					scope.AddDeclList((DeclList)node.rhs.get(0));
				}else{
					scope.AddFuncList((FuncList)node.rhs.get(0));
					TraverseSymbol(scope, node.rhs.get(0));
				}
				break;
			case 2:
				scope.AddDeclList((DeclList)node.rhs.get(0));
				scope.AddFuncList((FuncList)node.rhs.get(1));
				TraverseSymbol(scope, node.rhs.get(1));
				break;
			}
		}else if(node instanceof CompoundStmt){
			Scope newScope = scope.AddScope(node);
			if(node.Parent instanceof Function){
				if(node.Parent.rhs.size() == 6){
					newScope.AddParamList((ParamList)node.Parent.rhs.get(3));
				}
			}
			switch(node.rhs.size()){
				case 4:
					newScope.AddDeclList((DeclList)node.rhs.get(1));
					TraverseSymbol(newScope, node.rhs.get(2));
					break;
				case 3:
					TraverseSymbol(newScope, node.rhs.get(1));
					break;
			}
		}else if(node instanceof Terminal){
			return;
		}else{
			EachRHS(scope, node);			
		}
	}
}
