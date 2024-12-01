package practicePrograms.String;

public class DefinationOfString {

	public static void main(String[] args) {
		System.out.println("---------Using simple String class--------");
		String str = "Life is race";
		System.out.println(str);
		
		System.out.println("---------Using StringBuilder class--------");
		StringBuilder strb =new StringBuilder("Life ");
		strb.append("is a race");
		System.out.println(strb);
		
		System.out.println("---------Using StringBuffer class--------");
		StringBuffer strk =new StringBuffer("Life ");
		strk.append("is a race");
		System.out.println(strk);
		
		int x=10;int y=++x;char c='a';
		c++;
		System.out.println(c);System.out.println(x+","+y);
		

	}

}
