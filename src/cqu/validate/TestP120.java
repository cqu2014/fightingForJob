package cqu.validate;

public class TestP120 {
	public static void main(String[] args) {
		Base base = new Agg();
		System.out.println(base.getF());
		System.out.println(((Agg)base).getF());
	}
}

class Base{
	public String getF() {
		String name ="Base";
		return name;
	}
}

class Agg extends Base{
	public String getF() {
		String name ="Agg";
		return name;
	}
}