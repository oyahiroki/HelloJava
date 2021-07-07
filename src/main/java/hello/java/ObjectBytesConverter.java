/*
 * Created on 2003/10/07
 */

package hello.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 * @author oyahiroki
 */
public class ObjectBytesConverter {

	public static byte[] toBytes(Serializable obj) {

		try {

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			oos.writeObject(obj);

			byte[] data = baos.toByteArray();

			return data;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Object toObject(byte[] data) {

		try {
			ObjectInputStream ois = new ObjectInputStream(
					new ByteArrayInputStream(data));
			return ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static Object[] toObjectArray(byte[] data) {

		try {
			ObjectInputStream ois = new ObjectInputStream(
					new ByteArrayInputStream(data));
			return (Object[]) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	static void printSize(Serializable obj) {
		System.err.println("obj=" + obj + ",size=" + toBytes(obj).length);
	}

	static int getByteSize(Serializable obj) {
		return toBytes(obj).length;
	}

	public static void main(String[] args) {

		{
			String[] obj = { "Hello", "Bye" };

			System.out.println(obj.getClass().getName());

			byte[] b = toBytes(obj);

			String[] s = (String[]) toObjectArray(b);

			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
		}

		{
			Vector<String> vector = new Vector<String>();
			vector.add("ABC");
			vector.add("DEF");
			vector.add("GHI");
			printSize(vector);

		}

		{
			ArrayList<String> vector = new ArrayList<String>();
			vector.add("ABC");
			vector.add("DEF");
			vector.add("GHI");
			printSize(vector);

		}

		printSize("ABC");

		{
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("ABC", "123");
			map.put("DEF", "456");
			map.put("XYZ", "789");
			printSize(map);

		}

		{
			String[] ss = { "ABC", "DEF", "XYZ" };
			printSize(ss);
		}
		{
			String[] ss = { "������", "������", "������" };
			printSize(ss);
		}
		{
			String[] ss = { "������", "����", "�L�L�L" };
			printSize(ss);
		}
		{
			printSize(null);
		}
		{
			// Object obj = null;
			// printSize(obj);
		}
	}
}
