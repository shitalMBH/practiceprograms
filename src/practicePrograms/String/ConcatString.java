package practicePrograms.String;

public class ConcatString {

	public static void main(String[] args) {
		String str1 = "I have ";
		String str2 = "upload my updated project on Git.";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1+str2);
	}

}
