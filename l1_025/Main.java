package l1_025;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine(); // 字符串中间有空格，用nextLine，next遇到空格会停下来
		s.close();

		int index = input.indexOf(' ');
		// System.out.println(input + " " + index);
		String firstPart = input.substring(0, index);
		String secondPart = input.substring(index + 1);
		// System.out.println(firstPart);
		// System.out.println(secondPart);

		boolean badFlag = false;
		int first = 0, second = 0;
		if (firstPart.matches("[0-9]+")) {
			first = Integer.parseInt(firstPart);
			if (first >= 1 && first <= 1000) { // [1, 1000]
				System.out.print(first);
			} else {
				badFlag = true;
				System.out.print("?");
			}
		} else {
			badFlag = true;
			System.out.print("?");
		}

		System.out.print(" + ");

		if (secondPart.matches("[0-9]+")) {
			second = Integer.parseInt(secondPart);
			if (second >= 1 && second <= 1000) {
				System.out.print(second);
			} else {
				badFlag = true;
				System.out.print("?");
			}
		} else {
			badFlag = true;
			System.out.print("?");
		}

		System.out.print(" = ");

		if (badFlag) {
			System.out.print("?");
		} else {
			System.out.print(first + second);
		}
	}

}
