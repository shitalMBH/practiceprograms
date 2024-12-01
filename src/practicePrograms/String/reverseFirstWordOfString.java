package practicePrograms.String;

public class reverseFirstWordOfString {

	public static void main(String[] args) {
		String str = "TODO Auto-generated method stub";
		String reverse[] = str.split(" ", 2);
		String pqr = reverse[1]; //we can assign any index of string array into string
		String abc = "";
		for (int i = pqr.length() - 1; i >= 1; i--) {
			abc=abc+pqr.charAt(i);
		}
		System.out.println(str);
		pqr = reverse[0] +" " +abc; //we can write any index of string array into string
		System.out.println(pqr);

	}

}
/*
Method used 
length() >> String class
split() >> String class
charAt(i) >> String class
*/
