package cqu.sort;

public class �ݹ�ȫ���� {
	public static int count = 0;
	public static void  fullLists(String[] arr,int k,int m) {
		//��β��ֻ��һ��Ԫ�ص�ʱ����β����ɵ�����ֻ��һ�֣����ӡ����ǰ���
		if (k == m) { 
			for(String ss:arr)
				System.out.print(ss+",");
			System.out.println("     "+(++count));
		}else {
			//��k��ʼһ�ΰѺ����Ԫ�طŵ��ײ���������Ԫ�ص����
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
