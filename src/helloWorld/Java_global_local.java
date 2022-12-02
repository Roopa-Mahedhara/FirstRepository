package helloWorld;

public class Java_global_local {

	//global variables
	int x=10;
	int y=20;
	
	public void method1() {
		int z=30;
		System.out.println(x);
		System.out.println(z);
	}
	
	public void method2() {
		int z=40;
		System.out.println(z);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		Java_global_local obj = new Java_global_local();
		obj.method1();
		obj.method2();

	}

}
