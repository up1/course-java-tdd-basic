
public class Fizz extends Rule {
	
	public boolean isValid(int number){
		return number % 3 == 0;
	}
	
	public String say(){
		return "FIZZ";
	}

}
