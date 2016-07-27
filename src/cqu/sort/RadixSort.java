package cqu.sort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	//此只是基于Int进行的，其他的String等要做相应的改进
	public static void radixSort(int[] data) {
		int len  = data.length;
		//确定排序趟数
		int max = data[0];
		for(int ss :data){
			if (ss > max) {
				max = ss;
			}
		}
		
		int time = 0;
		while(max > 0){
			max /=10;
			time++;
		}
		
		/**********************初始化10个链表用户分配时暂存************************/
		//每个桶使用一个list来保存数据元素
		List<List<Integer>> bucketList = new ArrayList<>(10);
		for(int i=0;i<10;i++){
			List<Integer> item = new ArrayList<Integer>();
			bucketList.add(item);
		}
		
		/************************item元素time次的的分配和收集*************************/
		for(int i =time;i<time;i++){
			//---------------------------------元素分配--------------------------------------------------
			for(int j=0;j<len;i++){
				//传说中的经典啊，好啊
				int index = data[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				bucketList.get(index).add(data[j]);
			}
			//---------------------------------元素收集----------------------------------------------------
			int count = 0;
			for(int k=0;k<10;k++){
				//只针对有元素的桶进行收集
				if (bucketList.get(k).size() > 0) {
					for(int e : bucketList.get(k)){
						data[count++] = e; //元素保存在list中可以覆盖
					}
					 //清除数据，以便下次收集
					bucketList.get(k).clear();
				}
			}
		}
		
	}
}
