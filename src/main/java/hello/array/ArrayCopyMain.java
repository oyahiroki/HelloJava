package hello.array;

import java.util.Arrays;

public class ArrayCopyMain {

	public static void main(String[] args) {

		String[] ss = { "000", "111", "222", "333", "444", "555", "666", "777", "888", "999" };

		for (int n = 0; n < ss.length - (4 - 1); n++) {
			String[] sss = new String[4];
			System.arraycopy(ss, n, sss, 0, 4);
			System.err.println(Arrays.toString(sss));
		}

	}

}
