package cqu.sort;

import java.util.Arrays;

//字典序全排列
public class 非递归全排序 {
	private static int count = 0;
	
	public static void main(String[] args) {
		int[] a = {1,4,5,2,3,9,10};
		fullList(a);
	}
	
	/*
	 *@param arr为升序排序序列 
	 *寻找比当前序列大的最小序列
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
			//从后向前寻找第一个升序相邻
			for(i=len-1;i>=0;--i){
				if (a[i] < a[i+1]) {
					break;
				} else if (i==0) {
					return;
				}
			}
			//从后向前寻找比a[i]大的元素
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
