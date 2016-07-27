package cqu.sort;

public class NineSort {
	public static void main(String[] args) {
		 int[] number = {12,95,45,15,78,84,100,21,95,51,24,-9,12,0};
		 int[] data = {10 ,14 ,73, 25 ,23 ,13 ,27, 94 ,33 ,39 ,25 ,59, 94 ,65 ,82 ,45};
		 int[] kong = {};
		 
		// bubbleSort(number);
		 //bubbleSort(kong);
		 
		 //simpleSort2(number);
		// simpleSort2(kong);
		 
		 //quickSort(number, 0, number.length-1);
		 //quickSort(kong, 0, kong.length-1);
		 
		 //insertSort(number);
		 //insertSort(kong);
		 
		 //binaryInsertSort(number);
		 //binaryInsertSort(kong);
		 
		 /*HeapSort.heapSort(number);
		 HeapSort.heapSort(data);
		 HeapSort.heapSort(kong);*/
		 
		 /*ShellSort.shellSort(number);
		 ShellSort.shellSort(data);
		 ShellSort.shellSort(kong);*/
		 
		/* showArr(number);
		 System.out.println();
		 showArr(kong);
		 System.out.println();
		 showArr(data);*/
		 
		MergeSort.Divide(data, 0, data.length-1);
		MergeSort.Divide(kong, 0, kong.length-1);
		MergeSort.Divide(number, 0, number.length-1);
		
		showArr(number);
		 System.out.println();
		 showArr(kong);
		 System.out.println();
		 showArr(data);
	}
	
	
	/*
	 *�۰�����㷨 
	 */
	public static void binaryInsertSort(int[] arr) {
		for(int i =1;i<arr.length;i++){
			int key = arr[i];
			int low = 0; //��������ͷ
			int high = i-1; //��������β
			
			//�۰���ǰ����
			while(low <=high){
				int mid = (low+high) >>1;
				if (arr[mid] >key) {
					high = mid - 1;
				}else {
					low = mid+1;
					if (arr[mid] == key) {
						break;
					}
				}
			}
			//��key������ݺ���
			for(int j = i;j>low;j--){
				arr[j] = arr[j-1];
			}
			arr[low] = key;
		}
	}
	
	/*
	 * �Ӻ���ǰ��Ĳ�������
	 */
	public static void insertSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++){
			int j = i-1; //jֻ���Ѿ��ź��������
			int temp = arr[i]; //temp ���浱ǰ��Ҫ�����Ԫ��
			while(j>=0 && arr[j] >temp){
				arr[j+1] = arr[j]; //�ѱ�temp���Ԫ�غ���
				j--; //������ǰ����
			}
			//�ҵ�����temp���ֵ,��jָʾ��λ��
			if(j != i-1){  //��j == i-1�ǿ������ƶ�һ��
				arr[j+1] = temp;
			}
		}
	}
	
	/*
	 * ��������
	 */
	public static void quickSort(int[] arr,int low,int high) {
		if (low < high) {
			int mid = getMiddle(arr, low,high);
			quickSort(arr, low, mid-1);
			quickSort(arr, mid+1, high);
		}
	}
	
	public static int getMiddle(int[] arr,int low,int high) {
		int pivot = arr[low];
		while(low < high){
			while(low<high && arr[high] >= pivot) high--;//���high==low
			arr[low] = arr[high];//��ʱarr[high] Ϊ������
			while(low < high && arr[low] <= pivot) low++;//���high==low
			arr[high] = arr[low]; // ��ʱarr[low]Ϊ������
		}
		//���ص���������high == low
		arr[low] = pivot;
		return low;
	}
	
	/*
	 * ��ѡ������
	 */
	public static void simpleSort(int[] arr) {
		//ÿ��Ѱ�����Ļ�����С�ķŵ���ǰ����ǰ�˻�������
		int len = arr.length;
		for(int i =0;i<len;i++){
			int min = i;
			for(int j=i+1;j<len;j++){
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	
	/*
	 * ��ѡ������====����Ѱ�����ֵ
	 */
	
	public static void simpleSort2(int[] arr) {
		int len = arr.length;
		for(int i =len-1;i>0;i--){
			int max = i;
			for(int j =0;j<i;j++){
				if (arr[max] < arr[j]) {
					max = j;
					}
				}
			if (max != i) {
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
				}
			}
		}
		
	
	/*
	 * ð������
	 */
	public static void	bubbleSort(int[] arr) {
		int temp;
		int len = arr.length;
		//������Ϊ�ջ��ߵ���Ԫ�����ͨ��
		for(int i = len -1;i > 0;i--){
			for(int j =0;j<i;j++){
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	/*
	 * ����˳���ӡ����Ԫ��
	 */
	public static void showArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

}
