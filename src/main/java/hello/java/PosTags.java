package hello.java;

public enum PosTags {

	NN("NN", "Noun, singular or mass"), VB("VB", "Verb, base form");

	String name;
	String description;

	private PosTags(String name, String description) {
		this.name = name;
		this.description = description;
	}

	static public String normailze(String s) {

		if (s == null) {
			return null;
		} //
		else if (s.equals("名詞")) {
			return NN.name;
		} //
		else if (s.equals("動詞") || s.equals("動詞語幹")) {
			return VB.name;
		} //
		else {
			return null;
		}

	}

}
