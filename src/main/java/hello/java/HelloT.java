package hello.java;

public class HelloT<T> {

	private T obj;

	public HelloT() {
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
