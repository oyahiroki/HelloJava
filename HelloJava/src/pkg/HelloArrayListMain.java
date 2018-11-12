package pkg;

import java.util.Arrays;
import java.util.List;

public class HelloArrayListMain {

	public static void main(String[] args) {
		String[] arr = { "a", "b", "c" };
		System.out.println(Arrays.toString(arr));
		List<String> list = Arrays.asList(arr);
		System.out.println(list.contains("x"));
		System.out.println(list.getClass().getName());
		System.out.println(Arrays.asList(arr).indexOf("a"));
		System.out.println(Arrays.asList(arr).indexOf("x"));
	}
}
