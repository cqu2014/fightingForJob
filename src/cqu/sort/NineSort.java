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
	 *折半插入算法 
	 */
	public static void binaryInsertSort(int[] arr) {
		for(int i =1;i<arr.length;i++){
			int key = arr[i];
			int low = 0; //有序序列头
			int high = i-1; //有序序列尾
			
			//折半向前查找
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
			//比key大的数据后移
			for(int j = i;j>low;j--){
				arr[j] = arr[j-1];
			}
			arr[low] = key;
		}
	}
	
	/*
	 * 从后向前查的插入排序
	 */
	public static void insertSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++){
			int j = i-1; //j只是已经排好序的序列
			int temp = arr[i]; //temp 保存当前需要插入的元素
			while(j>=0 && arr[j] >temp){
				arr[j+1] = arr[j]; //把比temp大的元素后移
				j--; //继续向前查找
			}
			//找到不比temp大的值,且j指示此位置
			if(j != i-1){  //当j == i-1是可以少移动一步
				arr[j+1] = temp;
			}
		}
	}
	
	/*
	 * 快速排序
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
			while(low<high && arr[high] >= pivot) high--;//最多high==low
			arr[low] = arr[high];//此时arr[high] 为脏数据
			while(low < high && arr[low] <= pivot) low++;//最多high==low
			arr[high] = arr[low]; // 此时arr[low]为脏数据
		}
		//返回的条件就是high == low
		arr[low] = pivot;
		return low;
	}
	
	/*
	 * 简单选择排序
	 */
	public static void simpleSort(int[] arr) {
		//每次寻找最大的或者最小的放到当前的最前端或者最后端
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
	 * 简单选择排序====基于寻找最大值
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
	 * 冒泡排序
	 */
	public static void	bubbleSort(int[] arr) {
		int temp;
		int len = arr.length;
		//当数组为空或者单个元素亦可通过
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
	 * 按照顺序打印数组元素
	 */
	public static void showArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

}
