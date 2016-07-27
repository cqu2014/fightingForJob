package wangzhen.job;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestScanner {
	static private Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] lineStr = line.split(" ");
		int n = Integer.parseInt(lineStr[0]);
		int v = Integer.parseInt(lineStr[1]);
		Map<String, Candy> candies = new HashMap<>();  //使用“列-因子”作为键值的map
		Candy candy;
		while (n-->0) {
		      line = scan.nextLine();
		      lineStr = line.split(" ");
		      candy = new Candy(lineStr[0], Integer.parseInt(lineStr[1]));
		      candies.put(lineStr[0]+"-"+lineStr[1], candy);
		}
		
		for (String string : candies.keySet()) {
			System.out.println(candies.get(string).weight);
		}
		
		System.out.println(v);
		
	}

}
