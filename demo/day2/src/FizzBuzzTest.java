import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	FizzBuzz fizzBuzz = new FizzBuzz();
	@Test
	public void input_1_should_say_1(){
		String actualResult = fizzBuzz.say(1);
		assertEquals("1", actualResult);
	}
	
	@Test
	public void input_2_should_say_2(){
		String actualResult = fizzBuzz.say(2);
		assertEquals("2", actualResult);
	}
	@Test
	public void input_3_should_say_fizz(){
		String actualResult = fizzBuzz.say(3);
		assertEquals("FIZZ", actualResult);
	}
	
	@Test
	public void input_5_should_say_buzz(){
		String actualResult = fizzBuzz.say(5);
		assertEquals("BUZZ", actualResult);
	}
	@Test
	public void input_6_should_say_fizz(){
		String actualResult = fizzBuzz.say(6);
		assertEquals("FIZZ", actualResult);
	}
	@Test
	public void input_10_should_say_buzz(){
		String actualResult = fizzBuzz.say(10);
		assertEquals("BUZZ", actualResult);
	}
	
	@Test
	public void input_15_should_say_buzz(){
		String actualResult = fizzBuzz.say(15);
		assertEquals("FIZZBUZZ", actualResult);
	}
	
}
