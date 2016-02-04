
public class Wow extends Rule {
	
	public boolean isValid(int number){
		return number % 7 == 0;
	}
	
	public String say(){
		return "WOW";
	}

}
