package pkg;

public class HelloString2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(removeAAA("123%あー%456%えー%789").equals("123456789"));
		System.out.println(removeAAA("123%あー%456%えー%").equals("123456"));
		System.out.println(removeAAA("%あー%").equals(""));
		System.out.println(removeAAA("%あー").equals("%あー"));
		System.out.println(removeAAA("あー%").equals("あー%"));
		System.out.println(removeAAA("123").equals("123"));
		System.out.println(removeAAA("%").equals("%"));
		System.out.println(removeAAA("").equals(""));
		System.out.println(removeAAA(null) == null);
	}

	static public String removeAAA(String s) {

		if (s == null) {
			return null;
		}

		int idx1 = s.indexOf("%");

		if (idx1 == -1) {
			return s;
		}

		int idxLast = s.lastIndexOf("%");

		if (idx1 == idxLast) {
			return s;
		}

		if ((idx1) > s.length()) {
			return s;
		}

		int idx2 = s.indexOf("%", idx1 + 1);

		String ret = s.substring(0, idx1) + s.substring(idx2 + 1);

		// System.out.println(ret);

		if (ret.indexOf("%") != -1) {
			// 再帰呼び出し
			ret = removeAAA(ret);
		}

		return ret;

	}

}
