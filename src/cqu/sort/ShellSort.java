package cqu.sort;

public class ShellSort {
	public static void shellSort(int[] data) {
		int len = data.length;
		int gap = 1; //���浱ǰ����
		int temp;
		int j;
		//ȷ����󲽳�
		while(gap < len/3){
			gap = gap *3 +1;
		}
		//������󲽳���1����������
		for(;gap>0;gap/=3){
			for(int i = gap;i<len;i++){ //ʹ��ֱ�Ӳ��뷨�������򣬲���֮�ڵ�Ϊ���������򲿷�
				temp = data[i];
				for( j=i-gap;j>=0 && data[j] > temp;j-=gap){
					data[j+gap] = data[j];
				}
				//��temp����j�����һ��λ��
				data[j+gap] = temp;
				
			}
		}
		
	}
}
