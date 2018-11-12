package pkg;

import java.util.Arrays;

public class HelloArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] ss1 = { "aaa", "bbb", "ccc" };
		String[] ss2;

		ss2 = (Arrays.copyOf(ss1, ss1.length));

		System.out.println(Arrays.toString(ss2));
		System.out.println(ss2);

	}

}
