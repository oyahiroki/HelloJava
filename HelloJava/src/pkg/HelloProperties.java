package pkg;

import java.io.IOException;
import java.util.Properties;

public class HelloProperties {

	static Properties props;

	static {
		props = new Properties();

		try {
			props.load(HelloProperties.class
					.getResourceAsStream(HelloProperties.class.getSimpleName()
							+ ".properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(props.getProperty("key1"));
		System.out.println(HelloProperties.class.getSimpleName());
	}

}
