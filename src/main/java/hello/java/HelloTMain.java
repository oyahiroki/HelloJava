package hello.java;

public class HelloTMain {

	public static void main(String[] args) {

		HelloT<String> obj = new HelloT<>();

		obj.setObj("Test");

		String test = obj.getObj();

		System.err.println(test);

	}

}
