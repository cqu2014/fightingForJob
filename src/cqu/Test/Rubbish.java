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
		System.out.println("第一次垃圾处理");
		aobj = bobj;
		System.gc();
		System.out.println("第二次垃圾处理");
		aobj = cobj;
		System.gc();
		System.out.println("第三次垃圾处理");
		cobj = null;
		System.gc();
		System.out.println("第四次垃圾处理");
		aobj = null;
		System.gc();
		System.out.println("第五次垃圾处理");
	}
}
