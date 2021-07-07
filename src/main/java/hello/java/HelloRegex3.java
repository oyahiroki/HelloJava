package hello.java;

public class HelloRegex3 {

	public static void main(String[] args) {

		String regex = "(https?|ftp)(:\\/\\/[-_.!~*\\'()a-zA-Z0-9;\\/?:\\@&=+\\$,%#]+)";

		String s = "this is test. http://nissan.co.jp";

		System.err.println(s.replaceAll(regex, ""));
	}

}
