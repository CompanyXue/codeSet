package l1_039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] Week = new int[10];
		Scanner s = new Scanner(System.in);
		int D;
		for (int i = 1; i < 8; i++) {
			Week[i] = i;
		}
		Week[8] = 1;
		Week[9] = 2;

		while ((D = s.nextInt()) > 0) {
			System.out.println(Week[D + 2]);
		}
		s.close();
	}
}
