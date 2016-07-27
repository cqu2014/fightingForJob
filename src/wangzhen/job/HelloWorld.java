package wangzhen.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class HelloWorld {
	private static Scanner scan1;
	
	/**
	 * delimiter()   ���ش� Scanner ��ǰ��������ƥ��ָ����� Pattern
	 * hasNext()     �ж�ɨ�����е�ǰɨ��λ�ú��Ƿ񻹴�����һ��
	 * hasNextLine() ����ڴ�ɨ�����������д�����һ�У��򷵻� true
	 * next()        ���Ҳ��������Դ�ɨ��������һ���������
	 * nextLine()    ��ɨ����ִ�е�ǰ�У�������������������Ϣ
	 * */

	public static void main(String[] args) {
		//System.out.println("Hello World.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		 
		
		/*scan1 = new Scanner("123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las");
		scan1.useDelimiter("|,|\\ "); //�Զ���Scanner�ķָ��,��Stringת���ɵ����ַ�
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
