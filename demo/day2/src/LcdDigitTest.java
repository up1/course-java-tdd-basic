import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class LcdDigitTest {

	@Test
	public void show_0() {
		String expectedResult = 
				" _ \n"
			  + "| |\n"
			  + "|_|\n";
		LcdDigit lcd = new LcdDigit();
		String actualResult = lcd.show(0);
		
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void show_1() {
		String expectedResult = 
				"   \n"
			  + "  |\n"
			  + "  |\n";
		LcdDigit lcd = new LcdDigit();
		String actualResult = lcd.show(1);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void show_10() {
		String expectedResult = 
				"    _ \n"
			  + "  || |\n"
			  + "  ||_|\n";
		LcdDigit lcd = new LcdDigit();
		String actualResult = lcd.show(10);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void show_101() {
		String expectedResult = 
				"    _    \n"
			  + "  || |  |\n"
			  + "  ||_|  |\n";
		LcdDigit lcd = new LcdDigit();
		String actualResult = lcd.show(101);
		
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void show_1010() {
		String expectedResult = 
				"    _     _ \n"
			  + "  || |  || |\n"
			  + "  ||_|  ||_|\n";
		LcdDigit lcd = new LcdDigit();
		String actualResult = lcd.show(1010);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void xxxxx() {
		int number = 10;
		String _tmp = number + "";
		char value = _tmp.charAt(0);
		assertEquals(1, value-48);
	}
	
}
