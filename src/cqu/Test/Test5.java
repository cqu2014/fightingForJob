package cqu.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test5 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		int num = 32;
		System.out.println(num>>32);
		for(int i=0;i<35;i++){
			System.out.println(i+"==>"+(num>>i));
		}
		
		System.out.println(num);
	}
	
	@Test
	public void test01(){
		System.out.println((99%10)/3);
	}
	
	@Test
	public void test02() {
		List<String> list = new ArrayList<>();
		String s1 = "wangzhen";
		String s2 = "wangzhen";
		list.add(s1);
		
		System.out.println(list.contains(s2));
	}
	
	@Test
	public void test03(){
		Scanner scan = new Scanner(System.in);
		float f = Float.valueOf(scan.nextLine());
		int i = Integer.parseInt(scan.nextLine());
		System.out.println(f+i);
		scan.close();
	}
	
	@Test
	public void test04(){
		for(int i =1;i<55;i++){
			System.out.print(i+",");
		}
	}

}
