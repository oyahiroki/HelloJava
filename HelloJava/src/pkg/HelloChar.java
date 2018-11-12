package pkg;

import java.io.UnsupportedEncodingException;

public class HelloChar {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		char c = 0x8140;
		c = 0x82A0;
		char c2 = 0x879F;
		// c2 = 0x82A0 + 100;

		for (int n = 0; (c + n) < c2; n++) {
			char c3 = (char) (c + n);

			// System.out.println(c == c3);

			byte[] bb = new byte[2];

			bb[0] = (byte) ((c3 >> 8) & 0xFF);
			bb[1] = (byte) ((c3) & 0xFF);

			String s = new String(bb, "MS932");
			System.out.print(s);
			if ((c3 & 0xF) == 0xF) {
				System.out.println();
			}
		}

	}

}
