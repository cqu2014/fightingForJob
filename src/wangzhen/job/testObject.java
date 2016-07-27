package wangzhen.job;

public class testObject {
	
	public static void main(String[] args) {
		int i =0;
		Integer j = new Integer(0);
		Integer k = new Integer(0);
		int[] a={1,2,3};
		int[] b = a;
		
		System.out.println(i==j); //自动拆箱
		System.out.println(j.equals(i));//值得比较
		System.out.println(j.equals(k));//两者值得比较
		System.out.println(k==j);//引用的地址不一样
		System.out.println(a==b);
		
	}
}
