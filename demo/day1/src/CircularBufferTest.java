import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CircularBufferTest {

	CircularBuffer circularBufffer = new CircularBuffer();

	@Test
	public void when_create_new_buffer_should_be_empty() {
		assertTrue(circularBufffer.isEmpty());
	}

	@Test
	public void when_add_one_data_should_not_empty() {
		circularBufffer.add("A");
		assertFalse(circularBufffer.isEmpty());
	}

	@Test
	public void when_add_one_data_should_get_same_data() {
		circularBufffer.add("A");
		assertEquals("A", circularBufffer.remove());
	}

	@Test
	public void when_add_one_data_should_get_same_data_02() {
		circularBufffer.add("B");
		assertEquals("B", circularBufffer.remove());
	}

	@Test
	public void when_add_two_data_should_get_same_data() {
		circularBufffer.add("A");
		circularBufffer.add("B");
		assertEquals("A", circularBufffer.remove());
		assertEquals("B", circularBufffer.remove());
	}

	@Test
	public void when_add_two_data_and_remve_all_should_be_empty() {
		circularBufffer.add("A");
		circularBufffer.add("B");
		circularBufffer.remove();
		circularBufffer.remove();
		assertTrue(circularBufffer.isEmpty());
	}

	@Test
	public void when_random_add_data_and_remove_all_should_be_empty() {
		circularBufffer.add("A");
		circularBufffer.remove();
		circularBufffer.add("B");
		circularBufffer.add("C");
		circularBufffer.remove();
		circularBufffer.remove();
		circularBufffer.add("D");
		circularBufffer.remove();
		assertTrue(circularBufffer.isEmpty());
	}

	@Test
	public void when_add_five_data_should_be_full() {
		circularBufffer.add("A");
		circularBufffer.add("B");
		circularBufffer.add("C");
		circularBufffer.add("D");
		circularBufffer.add("E");
		assertTrue(circularBufffer.isFull());
	}

	@Test
	public void when_add_five_data_should_not_full() {
		circularBufffer.add("A");
		circularBufffer.add("B");
		circularBufffer.add("C");
		circularBufffer.add("E");
		assertFalse(circularBufffer.isFull());
	}

	@Test(expected=UnderFlowException.class)
	public void when_create_and_remove_data_should_be_throw_underflow_exception() {
		circularBufffer.remove();
	}

}
