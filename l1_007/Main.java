package l1_007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();

		String[] array = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", };

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-')
				System.out.printf("fu ");
			else
				System.out.printf(array[Character.digit(str.charAt(i), 10)] + ((i != str.length() - 1) ? " " : ""));
		}
	}

}
