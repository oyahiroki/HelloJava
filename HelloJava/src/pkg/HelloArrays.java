package pkg;

import java.util.Arrays;

public class HelloArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new String[] { "a", "b", "c" }));

		String[] ss = { "z", "a", "b", "c" };

		System.out.println(Arrays.toString(ss));
		System.out.println(Arrays.binarySearch(ss, "z"));


		// É\Å[ÉgÇ≥ÇÍÇƒÇ»Ç¢Ç∆ÇæÇﬂ
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println(Arrays.binarySearch(ss, "a"));
		System.out.println(Arrays.binarySearch(ss, "z"));

	}

}
