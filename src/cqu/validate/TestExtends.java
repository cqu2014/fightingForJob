package cqu.validate;

public class TestExtends {
	public static void main(String[] args) {
		ClassB objectB = new ClassB();
		objectB.printValue();
		
		ClassA a = (ClassA)objectB;
		a.printValue();
		
		a = new ClassA();
		a.printValue();
		
		//���б������ܽ�parentǿתΪ��chid
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
