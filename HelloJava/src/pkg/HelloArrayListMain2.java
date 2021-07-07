package pkg;

import java.util.ArrayList;

public class HelloArrayListMain2 {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		{
			list1.add("aaa");
			list1.add("bbb");
			list1.add("ccc");

		}

		@SuppressWarnings("serial")
		ArrayList<String> list2 = new ArrayList<>() {
			{
				this.add("aaa");
				this.add("bbb");
				this.add("ccc");
			}
		};

		System.err.println(list1.toString());
		System.err.println(list1.getClass().getName());
		System.err.println(list2.toString());
		System.err.println(list2.getClass().getName());

	}

}
