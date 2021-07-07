package hello.regex;

public class HelloRegex1 {

	public static void main(String[] args) {
		String s = "ない";

		System.err.println(s.matches("ない"));
		System.err.println(s.matches("!ない"));
	}

}
