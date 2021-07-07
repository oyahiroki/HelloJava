package hello.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HelloHeiseiMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(new Locale("ja", "JP", "JP"));
		SimpleDateFormat format = new SimpleDateFormat("GGGGyyyy�NM��d��");
		System.out.println(format.format(new Date()));
	}

}
