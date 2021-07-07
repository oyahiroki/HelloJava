package hello.java;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class HelloClassFieldsMain {

	String s = "SS";
	String[] ss = { "AA", "BB" };
	int i = 10;
	int[] ii = { 1, 2, 3 };

	public void printFields() {

		// ���̃I�u�W�F�N�g�̃t�B�[���h���擾(private�܂�)
		Field[] fields = this.getClass().getDeclaredFields();

		for (int n = 0; n < fields.length; n++) {

			Object fieldObject = null;
			try {
				fieldObject = fields[n].get(this);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

			if (fieldObject.getClass().isArray() == false) {
				System.out.println(fieldObject.getClass().getName() + ":"
						+ fields[n].getName() + "=" + fieldObject.toString());
			} else {
				int length = Array.getLength(fieldObject);
				for (int i = 0; i < length; i++) {

					System.out.println(""
							+ Array.get(fieldObject, i).getClass().getName()
							+ "[" + i + "]" + ":" + fields[n].getName() + "["
							+ i + "]" + "=" + Array.get(fieldObject, i));
				}
			}

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloClassFieldsMain c = new HelloClassFieldsMain();
		c.printFields();
	}

}
