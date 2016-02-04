import static org.junit.Assert.*;

import org.junit.Test;


public class RangeTest {
	
	@Test
	public void xxx() {
		Range range = new Range();
		assertEquals("12345", range.of("[1,5]"));
		assertEquals("1234", range.of("[1,5)"));
		assertEquals("2345", range.of("(1,5]"));
		assertEquals("234", range.of("(1,5)"));
	}
	
	@Test
	public void should_end_number_with_5() {
		Range range = new Range();
		range.of("[1,5]");
		assertEquals(5, range.endNumber());
	}
	
	@Test
	public void should_end_number_with_4() {
		Range range = new Range();
		range.of("[1,5)");
		assertEquals(4, range.endNumber());
	}
	
	@Test
	public void should_start_number_with_1() {
		Range range = new Range();
		range.of("[1,5]");
		assertEquals(1, range.startNumber());
	}
	
	@Test
	public void should_start_number_with_2() {
		Range range = new Range();
		range.of("(1,5]");
		assertEquals(2, range.startNumber());
	}

	
	@Test
	public void should_end_with_exclusive() {
		Range range = new Range();
		range.of("[1,5)");
		assertFalse(range.isEndWithInclusive());
	}
	
	@Test
	public void should_end_with_inclusive() {
		Range range = new Range();
		range.of("[1,5]");
		assertTrue(range.isEndWithInclusive());
	}

	@Test
	public void should_start_with_inclusive() {
		Range range = new Range();
		range.of("[1,5]");
		assertTrue(range.isStartWithInclusive());
	}
	@Test
	public void should_start_with_exclusive() {
		Range range = new Range();
		range.of("(1,5]");
		assertFalse(range.isStartWithInclusive());
	}
	
	
	
}
