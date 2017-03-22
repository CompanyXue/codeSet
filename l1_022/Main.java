package l1_022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = s.nextInt();
		s.close();

		int odd = 0;
		int even = 0;

		for (int tmp : array) {
			if (tmp % 2 == 0)
				even++;
			else
				odd++;
		}

		System.out.printf("%d %d", odd, even);
	}

}
