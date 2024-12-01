package practicePrograms.String;

public class reverseString {

	public static void main(String[] args) {
//reverse with for loop and charaAt() method
		String str = "Anil is great gambler";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char a = str.charAt(i);
			reverse = reverse + a;
		}
		System.out.println(reverse);

		String str1 = "Any string is string but any class is not string";
		String reverse1 = "";
		for (int i = str1.length() - 1; i >= 0; i--) {

			reverse1 = reverse1 + str1.charAt(i);
		}
		System.out.println(reverse1);
// reverse with StringBuilder and append() and reverse()methods
		StringBuilder b = new StringBuilder();
		b.append("add class wth first class");
		b.reverse();
		System.out.println(b);

// reverse with StringBuilder and append() and reverse()methods
		StringBuffer c = new StringBuffer();
		c.append("maya is may and ahuti is also maya");
		c.reverse();
		System.out.println(c);
	}

}
/*
 * Method used length() >> String class charAt(i) >> String class
 */
