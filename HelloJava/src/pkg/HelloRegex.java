package pkg;

public class HelloRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myRegex = "%.+?%";

		String s = "123%Ç†Å[%456%Ç†Å[%789";
		System.out.println(s);
		System.out.println(s.replaceAll(myRegex, ""));
	}

}
