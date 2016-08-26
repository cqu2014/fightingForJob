package cqu.sort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	//��ֻ�ǻ���Int���еģ�������String��Ҫ����Ӧ�ĸĽ�
	public static void radixSort(int[] data) {
		int len  = data.length;
		//ȷ����������
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
		
		/**********************��ʼ��10�������û�����ʱ�ݴ�************************/
		//ÿ��Ͱʹ��һ��list����������Ԫ��
		List<List<Integer>> bucketList = new ArrayList<>(10);
		for(int i=0;i<10;i++){
			List<Integer> item = new ArrayList<Integer>();
			bucketList.add(item);
		}
		
		/************************itemԪ��time�εĵķ�����ռ�*************************/
		for(int i =time;i<time;i++){
			//---------------------------------Ԫ�ط���--------------------------------------------------
			for(int j=0;j<len;i++){
				//��˵�еľ��䰡���ð�
				int index = data[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				bucketList.get(index).add(data[j]);
			}
			//---------------------------------Ԫ���ռ�----------------------------------------------------
			int count = 0;
			for(int k=0;k<10;k++){
				//ֻ�����Ԫ�ص�Ͱ�����ռ�
				if (bucketList.get(k).size() > 0) {
					for(int e : bucketList.get(k)){
						data[count++] = e; //Ԫ�ر�����list�п��Ը���
					}
					 //������ݣ��Ա��´��ռ�
					bucketList.get(k).clear();
				}
			}
		}
		
	}
}
