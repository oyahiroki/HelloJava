package hello.java;

public class HelloParent implements Cloneable {

	String value;

	@Override
	protected HelloParent clone() {
		try {
			return (HelloParent) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public HelloParent() {
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
