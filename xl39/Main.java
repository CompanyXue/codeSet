package xl39;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		s.close();

		if (i <= 5) {
			System.out.print(i + 2);
		} else if (i == 6) {
			System.out.print(1);
		} else {
			System.out.print(2);
		}
		
	}
	
}
