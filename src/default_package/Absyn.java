package default_package;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Absyn {
	public static BufferedWriter out = null; 
	
	public int start_line, start_column, end_line, end_column;
	String Name;
	String ProductionRule;
	ArrayList<Absyn> rhs;
	Absyn Parent;
	int index;
	public Absyn(String Name, ArrayList<Absyn> rhs) {
		this.start_line = 0;
		this.start_column = 0;
		this.end_line = 0;
		this.end_column = 0;
		this.Name = Name;
		this.rhs = rhs;
		this.Parent = null;
		
		if(rhs != null){
			int len = rhs.size();
			for(int i=0;i<len;i++){
				rhs.get(i).Parent = this;
				rhs.get(i).index = i;
			}
			Absyn second = null;
			for(int i=0;i<len;i++){
				second = rhs.get(i);
				if(second.start_line != 0){
					this.start_line = second.start_line;
					this.start_column = second.start_column;
					break;
				}
			}
			for(int i=len-1;i>=0;i--){
				second = rhs.get(i);
				if(second.end_line != 0){
					this.end_line = second.end_line;
					this.end_column = second.end_column;
					break;
				}
			}
			ProductionRule = Name + ":=";
			if(len == 0){
				ProductionRule = Name + " := epsilon";
			}else{
				for(Absyn elem : rhs){
					ProductionRule += " " + elem.Name;
				}
			}
			if(len!=0) ProductionRule = String.format("%-60s %s", ProductionRule, this.loc());
			try{
				out.write(ProductionRule);
				out.newLine();
			}catch(IOException e)
			{
			}
		}
	}
	public String loc() { 
		return "[" + start_line + ":" + start_column + "~" + end_line + ":" + end_column + "]";
	}
	public String printAST()
	{
		return "";
	}	
}