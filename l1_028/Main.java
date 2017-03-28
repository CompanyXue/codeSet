package l1_028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			int num = s.nextInt();
			System.out.printf(isPrime(num) ? "Yes" : "No");
		}

		s.close();
	}

	private static boolean isPrime(int n) {
		return false;
	}

}
