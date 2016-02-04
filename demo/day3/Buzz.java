
public class Buzz extends Rule {
	
	public boolean isValid(int number){
		return number % 5 == 0;
	}
	
	public String say(){
		return "BUZZ";
	}

}
