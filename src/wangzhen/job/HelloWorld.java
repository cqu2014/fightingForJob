package wangzhen.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class HelloWorld {
	private static Scanner scan1;
	
	/**
	 * delimiter()   返回此 Scanner 当前正在用于匹配分隔符的 Pattern
	 * hasNext()     判断扫描器中当前扫描位置后是否还存在下一段
	 * hasNextLine() 如果在此扫描器的输入中存在另一行，则返回 true
	 * next()        查找并返回来自此扫描器的下一个完整标记
	 * nextLine()    此扫描器执行当前行，并返回跳过的输入信息
	 * */

	public static void main(String[] args) {
		//System.out.println("Hello World.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		 
		
		/*scan1 = new Scanner("123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las");
		scan1.useDelimiter("|,|\\ "); //自定义Scanner的分割符,把String转化成单个字符
		while (scan1.hasNext()) {
			System.out.println(scan1.next());
			
		} */
		
		
	/*	*/try {
			InputStream in = new FileInputStream(new File("G:\\aliFlight\\log11.txt"));
			scan1 = new Scanner(in);
			while (scan1.hasNextLine()) {
				System.out.println(scan1.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
