package hello.gson;

import com.google.gson.JsonObject;

public class HelloGson2 {

	public static void main(String[] args) {
		JsonObject jsonObj = new JsonObject();

		jsonObj.addProperty("field1", "test");
		jsonObj.addProperty("field2", 100);

		System.err.println(jsonObj.toString());

	}

}
