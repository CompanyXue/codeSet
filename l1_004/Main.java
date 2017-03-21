package l1_004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int F = s.nextInt();
		int C = 5 * (F - 32) / 9;
		s.close();

		System.out.printf("Celsius = %d\n", C);
	}
}
