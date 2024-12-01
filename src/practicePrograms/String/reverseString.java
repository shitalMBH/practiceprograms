package practicePrograms.String;

public class reverseString {

	public static void main(String[] args) {
		String str = "Anil is great gambler";
		String reverse = "";

		for (int i = str.length()-1; i >= 0; i--) {
			char a = str.charAt(i);
			reverse = reverse + a;
		}
		System.out.println(reverse);
	}

}
/*
Method used 
length() >> String class
charAt(i) >> String class
*/
