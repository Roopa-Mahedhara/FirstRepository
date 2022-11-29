package strings;

public class Seperate {

	//Separate alphabets, integers and special characters
	
	public void sep() {
		
		String str = "Roopa123!=Tejaswi!@#";
		
		StringBuilder alphabet = new StringBuilder();
		StringBuilder num = new StringBuilder();
		StringBuilder specialChar = new StringBuilder();
		
		int len = str.length();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				alphabet = alphabet.append(ch);
			}
			else if(Character.isDigit(ch)) {
				num = num.append(ch);
			}
			else {
				specialChar = specialChar.append(ch);
			}
		}
		System.out.println(alphabet);
		System.out.println(num);
		System.out.println(specialChar);
	}
	
	
	public static void main(String[] args) {
		
		Seperate obj = new Seperate();
		obj.sep();
	}

}
