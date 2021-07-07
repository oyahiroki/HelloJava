package hello.java;

public class MyClassMain {

	public static void main(String[] args) {

		MyClass mc = new MyClass() {
			{
				this.setN(10);
			}
		};

		System.out.println(mc);

	}

}
