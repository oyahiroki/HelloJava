package hello.java;

public class HelloStringObjectsMain {

	public void method() {

		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "BBB";

		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s3==s1);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloStringObjectsMain obj = new HelloStringObjectsMain();

		obj.method();

	}

}
