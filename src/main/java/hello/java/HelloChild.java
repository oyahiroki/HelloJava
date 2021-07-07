package hello.java;

public class HelloChild extends HelloParent {

	String value2;

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	@Override
	protected HelloChild clone() {
		return (HelloChild) super.clone();
	}

	@Override
	public String toString() {
		return "HelloChild [value2=" + value2 + ", value=" + value + "]";
	}

	static public void main(String[] args) throws Exception {
		HelloChild obj = new HelloChild();
		{
			obj.setValue("value1");
			obj.setValue2("value2");
		}
		HelloChild obj2 = obj.clone();

		System.err.println(obj2.toString());
	}

}
