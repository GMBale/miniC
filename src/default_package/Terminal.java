package default_package;

public class Terminal extends Absyn{
	String value;
	public Terminal(String Name, int line, int col)
	{
		super(Name,null);
		this.start_line = line;
		this.start_column = col;
		this.end_line = line;
		this.end_column = col + Name.length() - 1;
		this.value = null;		
	}
	public Terminal(String Name, Object value, int line, int col)
	{
		super(Name+"("+value.toString()+")",null);
		this.start_line = line;
		this.start_column = col;
		this.end_line = line;
		this.end_column = col + value.toString().length() - 1;
		this.value = value.toString();
	}
	public String printAST()
	{
		StringBuilder ret = new StringBuilder();
		if(value == null){
			ret.append(Name);			
		}else{
			ret.append(value);
		}
		return ret.toString();
	}	
}
