package cqu.validate;

public class TestConstructor extends Money{
    Rmb r=new Rmb();
   
    public TestConstructor(){
     
     System.out.println("Dollar is construct!");
   
    }
    public static void main(String[] args){
     
     new TestConstructor();
     
    }
}
class Money{
	public Money(){
	 System.out.println("Money is construct");
	}
}
class Rmb{
	public Rmb(){
	 System.out.println("RMB is construct");
}
}
