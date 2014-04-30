package default_package;

public class SymbolEntry {
	String Type;
	String Name;
	int ArraySize;
	boolean isArray;
	String Role;
	public SymbolEntry(String Type, String Name, boolean isArray, int ArraySize, String Role)
	{
		this.Type = Type;
		this.Name = Name;
		this.isArray = isArray;
		this.ArraySize = ArraySize;
		this.Role = Role;
	}
}
