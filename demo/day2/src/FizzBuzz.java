public class FizzBuzz {

	private String answer;

	public String say(int number) {
		answer = number + "";
		if(หารสามและห้าลงตัว(number)){
			answer = "FIZZBUZZ";
		}else if (หารสามลงตัว(number)) {
			answer = "FIZZ";
		} else if (หารห้าลงตัว(number)) {
			answer = "BUZZ";
		} 
		
		return answer;
	}

	private boolean หารสามและห้าลงตัว(int number) {
		return หารสามลงตัว(number) && หารห้าลงตัว(number);
	}

	private boolean หารห้าลงตัว(int number) {
		return number % 5 == 0;
	}

	private boolean หารสามลงตัว(int number) {
		return number % 3 == 0;
	}

}
