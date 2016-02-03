public class LcdDigit {

	private static final String NEWLINE = "\n";
	String[] line1;
	String[] line2;
	String[] line3;
	String result1 = "";
	String result2 = "";
	String result3 = "";
	
	public LcdDigit() {
		line1 = new String[]{ " _ ", "   " };
		line2 = new String[]{ "| |", "  |" };
		line3 = new String[]{ "|_|", "  |" };
	}

	public String show(int number) {
		String _tmp = number + "";
		for (int counter = 0; counter < _tmp.length(); counter++) {
			int position = _tmp.charAt(counter) - 48;
			result1 = result1 + line1[position];
			result2 = result2 + line2[position];
			result3 = result3 + line3[position];
		}
		return result1 + NEWLINE + result2 + NEWLINE + result3 + NEWLINE;
	}

}
