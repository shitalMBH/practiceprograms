package practicePrograms.Array;

import java.util.Arrays;

public class DefinationOfArray {

	public static void main(String[] args) {
		// String convert into String Array
		System.out.println("---String convert into String Array-----");
		String str = "Array Can be print in two ways";
		String reverse[] = str.split(" ", 2);
		for (int i = 0; i <= reverse.length - 1; i++) {
			System.out.println(reverse[i]);
		}
		System.out.println(Arrays.toString(reverse));
		String[] str1 = str.split(" ");
		System.out.println(Arrays.toString(str1));

		// Integer Array
		System.out.println("---int Array-----");
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));


		// char Array
		System.out.println("---char Array-----");
		char c[] = { 'a', 'b', 'f', 't' };
		for (int i = 0; i <= c.length - 1; i++) {
			System.out.print(c[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(c));

		
		// String Array
		System.out.println("---String Array-----");
		String abc[] = { "my", "life", "my", "rule" };
		System.out.println(Arrays.toString(abc));
		for (int i = 0; i <= abc.length - 1; i++) {
			System.out.print(abc[i] + ",");
		}

	}

}
