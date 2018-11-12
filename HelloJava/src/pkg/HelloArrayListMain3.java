package pkg;

import java.util.ArrayList;

public class HelloArrayListMain3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		{
			list.add("aaa");
			list.add("bbb");
			list.add("ccc");
		}

		System.out.println(list.contains("aaa"));

		System.out.println(list.indexOf("aaa"));

		System.out.println(list.get(list.indexOf("aaa")));
	}

}
