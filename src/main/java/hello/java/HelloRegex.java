package hello.java;

public class HelloRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myRegex = "%.+?%";

		String s = "123%���[%456%���[%789";
		System.out.println(s);
		System.out.println(s.replaceAll(myRegex, ""));
	}

}
