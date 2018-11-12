package pkg;

public class HelloStringFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double d = 31.415;

		System.out.println(String.format("%.3f", (d / 100)));
	}

}
