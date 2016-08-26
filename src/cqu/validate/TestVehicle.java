package cqu.validate;

public class TestVehicle {
	public static void main(String[] args) {
		//�������������
		Vehicle vehicle;
		Car car = new Car(1, 2, 10,"wangzhen ");
		//����̳����ĳ�Ա�������Լ��Ĺ��캯����ʵ������super����ֻ��ʵ�����������ĳ�Ա
		System.out.println(car.weight);
		System.out.println(car.name);
	}
}

abstract class Vehicle{
	public int wheels;
	protected float weight;
	public String name;
	
	public abstract void logo() ;
	public Vehicle(int w,float g,String name) {
		wheels = w;
		weight = g;
		this.name = name+"V";
	}
	
	public void speak() {
		System.out.println("the w vehicle is speaking.");
	}
}

class Car extends Vehicle{
	int passengers;
	public Car(int w,float g,int p,String nString) {
		super(w, g,nString);
		wheels = w+1;
		weight = g+1;
		passengers = p;
		name = nString +"C";
	}
	
	@Override
	public void logo() {
		System.out.println("\n Car");
	}
}
