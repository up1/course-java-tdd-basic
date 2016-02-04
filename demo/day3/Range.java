
public class Range {

	private String pattern;

	public String of(String input) {
		pattern = input;
		String result = "";
		for(int i=startNumber(); i<=endNumber(); i++){
			result += i;
		}
		return result;
	}

	public boolean isStartWithInclusive() {
		return pattern.charAt(0) == '[';
	}

	public boolean isEndWithInclusive() {
		return pattern.charAt(pattern.length()-1) == ']';
	}

	public int startNumber() {
		if(isStartWithInclusive()){
			return pattern.charAt(1) - 48;
		}
		return pattern.charAt(1) - 47;
	}

	public int endNumber() {
		if(isEndWithInclusive()){
			return pattern.charAt(pattern.length()-2) - 48;
		}
		return pattern.charAt(pattern.length()-2) - 49;
	}

}





