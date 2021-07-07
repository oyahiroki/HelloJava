package hello.java;

public class HelloRange {

	public static void main(String[] args) {
		int n = 0;

		System.err.println(getFolderName(0));
		System.err.println(getFolderName(1));
		System.err.println(getFolderName(999));
		System.err.println(getFolderName(1000));
		System.err.println(getFolderName(1800));
		System.err.println(getFolderName(1999));
		System.err.println(getFolderName(10000));

	}

	private static String getFolderName(int n) {
		int range = 1000;

		int base = n / range;

		int base1 = base * range;

		int base2 = (base + 1) * range - 1;

		return String.format("%08d-%08d", base1, base2);
	}

}
