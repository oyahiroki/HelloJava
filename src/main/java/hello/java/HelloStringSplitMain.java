package hello.java;

public class HelloStringSplitMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "aaa";

		String[] ss = s.split(",");

		System.out.println(ss.length);

		System.out.println(ss[0]);

	}

}
