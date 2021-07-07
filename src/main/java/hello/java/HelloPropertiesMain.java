package hello.java;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class HelloPropertiesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		{
			String file = "file/utf8.properties";
			Properties prop = new Properties();
			prop.load(new FileInputStream(file));
			System.out.println(prop.getProperty("msg"));
		}

		{
			String file = "file/default.properties";
			Properties prop = new Properties();
			prop.load(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			System.out.println(prop.getProperty("msg"));
		}

		{
			String file = "file/utf8.properties";
			Properties prop = new Properties();
			prop.load(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			System.out.println(prop.getProperty("msg"));
		}

	}

}
