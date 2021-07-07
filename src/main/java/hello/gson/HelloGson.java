package hello.gson;

import com.google.gson.JsonObject;

public class HelloGson {

	public static void main(String[] args) {
		JsonObject jsonObj = new JsonObject();

		jsonObj.addProperty("field1", "test");

		System.err.println(jsonObj.get("field1").getAsNumber());
		

	}

}
