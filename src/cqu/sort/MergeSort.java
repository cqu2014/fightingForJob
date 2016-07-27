package cqu.sort;

public class MergeSort {
	
	public static void Merge(int[] data,int low,int mid,int high) {
		int[] temp = new int[high-low+1];
		int k = 0;
		int i = low;
		int j = mid+1;
		while(i<=mid && j <=high){
			temp[k++] = data[i] < data[j] ? data[i++]:data[j++];
		}
		//if i>j
		while(i<=mid)
			temp[k++] = data[i++];
		//if i< j
		while(j<=high)
			temp[k++] = data[j++];
		
		// 将temp中的有序数据拷贝到打他中
		for(int k1=0;k1< temp.length;k1++){
			data[low+k1] = temp[k1];
		}
	}
	
	public static void Divide(int[] data,int low,int high) {
		//int mid = (low+high)>>1;
		int mid = low + ((high-low)>>1);
		if(low < high){
			Divide(data, low, mid);
			Divide(data, mid+1, high);
			Merge(data, low, mid, high);
		}
	}
}
