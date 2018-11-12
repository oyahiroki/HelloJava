package pkg;

public class MyClass {
	private int n = 0;

	public MyClass() {

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "MyClass [n=" + n + "]";
	}

}
