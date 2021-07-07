package hello.java;

import java.io.UnsupportedEncodingException;

public class HelloSJIS {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		// 82A0 SJIS
		// 3042 Unicode

		byte[] bb = { (byte) 0x87, (byte) 0x40 };

		String s = new String(bb, "MS932");

		System.out.println(s);

	}

}
