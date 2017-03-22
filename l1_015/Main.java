package l1_015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int column = s.nextInt();
		String str = s.next();
		s.close();

		int rows = (int) (column / 2.0 + 0.5);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++)
				System.out.print(str);

			System.out.println();
		}
	}

}
