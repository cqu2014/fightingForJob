package cqu.validate;

import java.util.ArrayList;
import java.util.List;

public class P100 {
	private String value = null;
	
	public   P100(String vString) {
		value = vString;
	}
	
	public boolean equals(P100 o) {
		System.out.println("=========================");
		if (o== this) {
			return true;
		}
		if (o instanceof P100) {
			P100 p100 = (P100) o;
			return value.equals(p100.value);
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("*****************************************");
		return super.equals(obj);
		//return this.equals((P100)(obj));
	}
	
	public static void main(String[] args) {
		List list = new ArrayList<>();
		P100 test1 = new P100("wang");
		P100 test2 = new P100("wang");
		P100 test3 = new P100("wang");
		Object test4 = new P100("wang");
		P100 test5 = test1;
		list.add(test1);
		
		System.out.println(list.contains(test2));  //保存的地址
		System.out.println(list.contains(test5)); //地址相同
		System.out.println(test2.equals(test3)); 
		System.out.println(test3.equals((P100)test4)); //调用object的equals
	}
	
	
	
}
