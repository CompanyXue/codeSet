package l1_024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		s.close();

		System.out.printf("%d", d == 5 ? 7 : (d + 2) % 7);
	}

}
