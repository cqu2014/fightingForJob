package cqu.validate;

class Dog {   
   public Dog() {   
     System.out.println("Dog");   
    }   
    static{   //��̬��
        System.out.println("super static block");   
    }       
  {   
        System.out.println("super block");   
    }   
}  
 public class Mastiff extends Dog {   
    public Mastiff() {   
        System.out.println("Mastiff");   
    }   
     {   
        System.out.println("block");   
       }   
   static {   
      System.out.println("static block");   
 }   
  public static void  main(String[] args){   
      Mastiff mastiff=new Mastiff();         //ʵ����һ������
    }   
}   