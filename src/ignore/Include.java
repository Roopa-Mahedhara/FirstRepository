package ignore;

public class Include {

	//sample class to include in git 
	public void method1(){
		System.out.println("Include this class");
	}

	public static void main(String[] args) {
		Include obj = new Include();
		obj.method1();

	}

}
