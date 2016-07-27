package cqu.Test;

public class Param {
	
	private int count ;
	
	public Param(int num) {
		count = num;
	}

	public static void main(String[] args) {
		/*Boolean test = true;
		test(test);
		System.out.println(test);*/
		Param param = new Param(99);
		System.out.println(param.count);
		
	}
	
	public static void test(Boolean test) {
		test = !test;
		System.out.println("In test(),test = "+test);
	}

}
