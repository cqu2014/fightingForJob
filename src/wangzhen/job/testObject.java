package wangzhen.job;

public class testObject {
	
	public static void main(String[] args) {
		int i =0;
		Integer j = new Integer(0);
		Integer k = new Integer(0);
		int[] a={1,2,3};
		int[] b = a;
		
		System.out.println(i==j); //�Զ�����
		System.out.println(j.equals(i));//ֵ�ñȽ�
		System.out.println(j.equals(k));//����ֵ�ñȽ�
		System.out.println(k==j);//���õĵ�ַ��һ��
		System.out.println(a==b);
		
	}
}
