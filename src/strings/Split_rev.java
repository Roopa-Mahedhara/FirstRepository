package strings;

public class Split_rev {

	//split the string and reverse each word
	
	public void rev() {
		
		String str = "My name is Roopa";	
		String[] word = str.split(" ");	
		int length = word.length;
		
		for(int i=0; i<length; i++) 
		{
			String wr = word[i];
			int len = wr.length();
			for(int j=len-1; j>=0; j--) {
				char ch = wr.charAt(j);
				System.out.print(ch);	
			}
			System.out.println();
		}		
	}	
	public static void main(String[] args) {
		
		Split_rev obj = new Split_rev();
		obj.rev();
	}

}
