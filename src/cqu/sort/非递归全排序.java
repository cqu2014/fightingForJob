package cqu.sort;

import java.util.Arrays;

//�ֵ���ȫ����
public class �ǵݹ�ȫ���� {
	private static int count = 0;
	
	public static void main(String[] args) {
		int[] a = {1,4,5,2,3,9,10};
		fullList(a);
	}
	
	/*
	 *@param arrΪ������������ 
	 *Ѱ�ұȵ�ǰ���д����С����
	 */
	public static void fullList(int[] a) {
		Arrays.sort(a);
		int len = a.length-1;
		if(len <1){
			print(a);
			return;
		}
		
		while(true){
			print(a);
			int i,j;
			//�Ӻ���ǰѰ�ҵ�һ����������
			for(i=len-1;i>=0;--i){
				if (a[i] < a[i+1]) {
					break;
				} else if (i==0) {
					return;
				}
			}
			//�Ӻ���ǰѰ�ұ�a[i]���Ԫ��
			for( j=len;j>i;--j){
				if (a[j]>a[i]) {
					break;
				}
			}
			swap(a,i,j);
			reverse(a,i+1,len);
		}
		
	}
	
	public static void print(int[] a) {
		for(int ele:a)
			System.out.print(ele+",");
		System.out.println("  "+(++count));
	}
	
	public static void reverse(int[] a,int start,int end) {
		while(start<end){
			swap(a, start++, end--);
		}
	}
	
	public static void swap(int[] a,int i,int j) {
		a[i] = a[i]+a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
	}
}
