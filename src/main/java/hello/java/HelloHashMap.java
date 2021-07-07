package hello.java;

import java.util.ArrayList;
import java.util.HashMap;

public class HelloHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		{
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int n = 0; n < 1000000; n++) {
				map.put("a" + n, n);
			}

			long time = System.currentTimeMillis();

			System.out.println(map.get("a777777"));

			System.err.println(System.currentTimeMillis() - time);
		}
		{
			ArrayList<String> list = new ArrayList<String>();
			for (int n = 0; n < 1000000; n++) {
				list.add("a" + n);
			}
			long time = System.currentTimeMillis();

			System.out.println(list.get(777777));

			System.err.println(System.currentTimeMillis() - time);

		}

	}

}
