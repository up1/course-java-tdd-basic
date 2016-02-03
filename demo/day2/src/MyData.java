
public class MyData {

	public void save() {
		throw new DuplicatedException();
	}

	public void delete() throws Exception {
		throw new DataNotFoundException();
	}

}
