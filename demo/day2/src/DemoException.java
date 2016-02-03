public class DemoException {

	public void caller() {
		try {
			login();
		} catch (RuntimeException e) {
			
		}
	}

	public void login() {
		try {
			Class.forName("xxxxx");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException();
		}
	}

}
