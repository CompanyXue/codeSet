package xl37;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();

		float a = A;
		if (B == 0) {
			System.out.printf("%d/%d=Error\n", A, B);
		} else if (B < 0) {
			System.out.printf("%d/(%d)=%.2f\n", A, B, a / B);
		} else {
			System.out.printf("%d/%d=%.2f\n", A, B, a / B);
		}
	}
}