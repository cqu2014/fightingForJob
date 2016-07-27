package cqu.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Saima2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> result = new ArrayList<>();
		String data;
		//while((data = scan.nextLine())!=null){
		while(!(data= scan.nextLine()).equals("")){
				String[] number = data.toString().split(" ");
				int a = Integer.parseInt(number[0]);
				int b = Integer.parseInt(number[1]);
				int k = Integer.parseInt(number[2]);
				
				int count = 0;
				for(int m = a;m<b;m++){
					for(int n=2;n<k;n++){
						System.out.println(n);
						if (m%n ==0) 
							break;
					}
				}
				result.add(count);
		}
		for(int t:result){
			System.out.println(t);
		}
		
	}

}
