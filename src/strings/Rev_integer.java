package strings;

public class Rev_integer {

	//reverse an integer
	
	public void rev() {
		int num = 12345;
		int rev = 0;
		System.out.println("Actual number:" +num);
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		
		System.out.println("After reversing:" +rev);
	}
	public static void main(String[] args) {
		
		Rev_integer obj = new Rev_integer();
		obj.rev();
	}

}
