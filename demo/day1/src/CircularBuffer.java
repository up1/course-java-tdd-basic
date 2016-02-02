public class CircularBuffer {

	private boolean count = true;
	private String[] buffer = new String[5];
	private int writePointer;
	private int readPointer;

	public boolean isEmpty() {
		return readPointer == writePointer;
	}

	public void add(String data) {
		buffer[writePointer++] = data;
	}

	public String remove(){
		if(isEmpty()){
			throw new UnderFlowException();
		}
		return buffer[readPointer++];
	}

	public boolean isFull() {
		return writePointer-readPointer == buffer.length;
	}

}
