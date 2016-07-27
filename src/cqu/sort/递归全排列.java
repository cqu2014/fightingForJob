package cqu.sort;

public class 递归全排列 {
	public static int count = 0;
	public static void  fullLists(String[] arr,int k,int m) {
		//当尾部只有一个元素的时候，其尾部组成的序列只有一种，则打印出当前组合
		if (k == m) { 
			for(String ss:arr)
				System.out.print(ss+",");
			System.out.println("     "+(++count));
		}else {
			//从k开始一次把后面的元素放到首部，求余下元素的组合
			for(int j=k;j<=m;j++){
				swap(arr,j,k);
				fullLists(arr, k+1, m);
				swap(arr,j,k);
			}
		}
	}

	private static void swap(String[] arr,int m,int n) {
		String temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
	
	public static void main(String[] args) {
		String[] letter = {"1","2","3","4","5","6"};
		fullLists(letter, 0, letter.length-1);
	}
}
