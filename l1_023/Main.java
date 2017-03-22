package l1_023;

// Java超时，改用C写了。代码main.c也在这个包下。
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();

		int g = 0, p = 0, l = 0, t = 0;

		/*
		for (int i = 0; i < str.length(); i++) {
			char currentChar = Character.toLowerCase(str.charAt(i));

			if (currentChar == 'g') {
				g++;
			} else if (currentChar == 'p') {
				p++;
			} else if (currentChar == 'l') {
				l++;
			} else if (currentChar == 't') {
				t++;
			} else {

			}
		}
		*/
		
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (currentChar == 'g' || currentChar == 'G') {
				g++;
			} else if (currentChar == 'P'|| currentChar == 'p') {
				p++;
			} else if (currentChar == 'l' || currentChar == 'L') {
				l++;
			} else if (currentChar == 't' || currentChar == 'T') {
				t++;
			} else {

			}
		}
		
		int totalChar = g + p + l + t;
		for (int i = 0; i < totalChar; i++) {
			if (g-- > 0) {
				System.out.print("G");
			}

			if (p-- > 0) {
				System.out.print("P");
			}

			if (l-- > 0) {
				System.out.print("L");
			}

			if (t-- > 0) {
				System.out.print("T");
			}
		}
	}

}
