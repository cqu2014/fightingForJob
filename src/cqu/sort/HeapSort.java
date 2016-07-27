package cqu.sort;

public class HeapSort {

	public static void heapSort(int[] arr) {
		int len = arr.length;
		for(int i =0;i<len;i++){
			adjust(arr,len-1-i);
			swap(arr, 0, len-1-i);
		}
	}
	
	//������������󶥶�
	public static void adjust(int[] arr,int lastIndex) {
		//�����һ���ڵ�ĸ��ڵ㿪ʼ������
		for(int i = ((lastIndex-1)>>1);i>=0;i--){
			int k = i;
			//�ڵ�ǰ�ڵ���ӽڵ���ڵ�������
			while(k*2+1 <= lastIndex){
				int bigger = 2*k+1;
				//���������ӽڵ㣬�Ƚ����ҵĴ�С
				if (bigger < lastIndex) {
					if (arr[bigger] < arr[bigger+1]) {
						bigger++;
					}
				} //�ҵ����ҵĽϴ���
				
				//�͸��ڵ�Ƚ�
				if (arr[k] < arr[bigger]) {
					swap(arr, k, bigger);
					k = bigger;
				}else {
					//��Ԫ�ز����ڸ�Ԫ�أ�û�з�������������
					break;
				}
			}
		}
	}
	
public static void swap1(int[] arr,int m,int n) {
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;
	}
	
	public static void swap(int[] arr,int m,int n) {
		if (m==n) {
			return;
		}
		arr[m] = arr[m]+arr[n];
		arr[n] = arr[m] - arr[n];
		arr[m] = arr[m] - arr[n];
		
	}

}
