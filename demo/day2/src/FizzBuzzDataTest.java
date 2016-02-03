import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzDataTest {
	
	int number;
	String expectedResult;
	
	public FizzBuzzDataTest(int number, String expectedResult) {
		super();
		this.number = number;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> myData() {
		return Arrays.asList(new Object[][] {
				{1, "1"},
				{2, "2"},
				{3, "FIZZ"},
		});
	}
	
	FizzBuzz fizzBuzz = new FizzBuzz();
	@Test
	public void should_say(){
		String actualResult = fizzBuzz.say(number);
		assertEquals(expectedResult, actualResult);
	}
	
	

}
