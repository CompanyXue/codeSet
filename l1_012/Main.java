package l1_012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		System.out.printf("2^%d = %d", n, (int) Math.pow(2, n));
	}

}
