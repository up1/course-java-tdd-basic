
public class FB extends Rule {
	
	public boolean isValid(int number){
		return number % 3 == 0 && number % 5 == 0;
	}
	
	public String say(){
		return "FIZZBUZZ";
	}

}
