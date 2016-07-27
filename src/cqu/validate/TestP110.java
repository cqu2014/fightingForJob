package cqu.validate;

public class TestP110 extends X {
	public TestP110() {
		System.out.println("Z");
	}
	
	Y y = new Y();
	
	
	
	public static void main(String[] args) {
		new TestP110();
	}
}

class X{
	Y b = new Y();
	X(){
		System.out.println("X");
	}
 }

class Y{
	Y(){
		System.out.println("Y");
	}
}
