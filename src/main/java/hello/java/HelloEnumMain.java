package hello.java;

public class HelloEnumMain {

	public enum commandname {
		a, b, c
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(HelloEnumMain.commandname.valueOf("x"));

	}

}
