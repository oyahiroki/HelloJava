package hello.exception;

public class OutOfMemory {

	public void doSomething() {
		OutOfMemoryError e = new OutOfMemoryError();
		e.printStackTrace();
	}

}
