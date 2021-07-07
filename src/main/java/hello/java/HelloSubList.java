package hello.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class HelloSubList {

	public static void main(String[] args) {

List<String> list0 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg");

		{
			List<List<String>> lists = separate(list0, 2);

			for (List<String> ll : lists) {
				System.err.println(ll);
			}
		}
		System.err.println("---");
		{
List<List<String>> lists = ListUtils.partition(list0, 3);
for (List<String> list : lists) {
	System.err.println(list);
}
		}
		System.err.println("---");
		{
List<List<String>> lists = ListUtils.partition(list0, list0.size() / 2 + 1);
for (List<String> ll : lists) {
	System.err.println(ll);
}
		}

	}

	static List<List<String>> separate(List<String> list, int n) {

		int nn = list.size() / n;
		int xx = list.size() % n;

		List<List<String>> ret = new ArrayList<List<String>>();
		for (int x = 0; x < n; x++) {

			int a = 0 + nn * x;
			int b = a + nn;

			List<String> l = new ArrayList(list.subList(a, b));
			ret.add(l);
		}

		for (int x = (n * nn); x < list.size(); x++) {
			System.err.println("x=" + x);
			int size = ret.size();
			for (int y = 0; y < xx; y++) {
				List<String> list2 = ret.get(size - 1);
				list2.add(list.get(x + y));
			}
		}

		return ret;

	}

}
