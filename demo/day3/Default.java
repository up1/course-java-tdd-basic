
public class Default extends Rule {
	
	private int number;

	public boolean isValid(int number){
		this.number = number;
		return true;
	}
	
	public String say(){
		return number + ""; 
	}

}
