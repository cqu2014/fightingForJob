package cqu.sort;

public class ShellSort {
	public static void shellSort(int[] data) {
		int len = data.length;
		int gap = 1; //保存当前步长
		int temp;
		int j;
		//确定最大步长
		while(gap < len/3){
			gap = gap *3 +1;
		}
		//遍历最大步长到1各步的排序
		for(;gap>0;gap/=3){
			for(int i = gap;i<len;i++){ //使用直接插入法进行排序，步长之内的为各个组有序部分
				temp = data[i];
				for( j=i-gap;j>=0 && data[j] > temp;j-=gap){
					data[j+gap] = data[j];
				}
				//把temp插入j后面的一个位置
				data[j+gap] = temp;
				
			}
		}
		
	}
}
