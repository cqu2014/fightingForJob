package cqu.Test;

public class Rubbish {

	static int i=0;
	int j;
	public Rubbish() 
	{
		j=i;
		i++;
	}
	protected void finalize() 
	{
		System.out.println(j);
	}

public static void main(String[] args) {
	
		Object aobj = new Rubbish ( );
		Object bobj = new Rubbish ( );
		Object cobj = new Rubbish ( );
		
		System.gc();
		System.out.println("��һ����������");
		aobj = bobj;
		System.gc();
		System.out.println("�ڶ�����������");
		aobj = cobj;
		System.gc();
		System.out.println("��������������");
		cobj = null;
		System.gc();
		System.out.println("���Ĵ���������");
		aobj = null;
		System.gc();
		System.out.println("�������������");
	}
}
