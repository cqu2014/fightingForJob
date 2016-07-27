package cqu.validate;

class Dog {   
   public Dog() {   
     System.out.println("Dog");   
    }   
    static{   //静态块
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
      Mastiff mastiff=new Mastiff();         //实例化一个对象
    }   
}   