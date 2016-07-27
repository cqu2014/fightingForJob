package cqu.sort;

public class HeapSort {

	public static void heapSort(int[] arr) {
		int len = arr.length;
		for(int i =0;i<len;i++){
			adjust(arr,len-1-i);
			swap(arr, 0, len-1-i);
		}
	}
	
	//调整数组简历大顶堆
	public static void adjust(int[] arr,int lastIndex) {
		//从最后一个节点的父节点开始，调整
		for(int i = ((lastIndex-1)>>1);i>=0;i--){
			int k = i;
			//在当前节点的子节点存在的条件下
			while(k*2+1 <= lastIndex){
				int bigger = 2*k+1;
				//若存在右子节点，比较左右的大小
				if (bigger < lastIndex) {
					if (arr[bigger] < arr[bigger+1]) {
						bigger++;
					}
				} //找到左右的较大者
				
				//和父节点比较
				if (arr[k] < arr[bigger]) {
					swap(arr, k, bigger);
					k = bigger;
				}else {
					//子元素不大于父元素，没有发生交换就跳出
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
