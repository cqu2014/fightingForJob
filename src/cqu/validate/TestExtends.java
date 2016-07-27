package cqu.validate;

public class TestExtends {
	public static void main(String[] args) {
		ClassB objectB = new ClassB();
		objectB.printValue();
		
		ClassA a = (ClassA)objectB;
		a.printValue();
		
		a = new ClassA();
		a.printValue();
		
		//运行报错，不能将parent强转为成chid
		((ClassB)a).printValue();
	}
}

class ClassA{
	public void printValue() {
		System.out.println("ClassA");
	}
}

class ClassB  extends ClassA{
	public void printValue() {
		System.out.println("ClassB");
	}
}
