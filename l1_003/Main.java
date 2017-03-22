package l1_003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();

		int[] array = new int[10];

		for (int i = 0; i < str.length(); i++) {
			int num = Character.digit(str.charAt(i), 10);
			array[num]++;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				System.out.printf("%d:%d\n", i, array[i]);
		}
	}

}
