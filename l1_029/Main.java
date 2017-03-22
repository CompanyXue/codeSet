package l1_029;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		s.close();
		float res = (float) (2 * (h-100) * 0.9);
		System.out.printf("%.1f", res);
	}

}
