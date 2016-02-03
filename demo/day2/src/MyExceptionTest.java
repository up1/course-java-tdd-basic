import org.junit.Test;


public class MyExceptionTest {
	
	@Test(expected=DuplicatedException.class)
	public void should_thrown_RuntimeException() {
		MyData myData = new MyData();
		myData.save();
	}
	
	@Test(expected=DataNotFoundException.class)
	public void should_thrown_Exception() throws Exception {
		MyData myData = new MyData();
		myData.delete();
	}

}
