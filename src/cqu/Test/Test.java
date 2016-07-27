package cqu.Test;

public class Test {

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void test() throws Exception{
		throw new Exception("test");
	}
	
	public void NoStatic() throws Exception {
		test();
	}

}
