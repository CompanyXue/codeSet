package l1_002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String str = s.next();
		s.close();

		int n = (int) Math.sqrt((num + 1) / 2.0);
		int rest = num - (2 * n * n - 1);
		int maxWidth = 2 * n - 1;
		
		int i;
		for (i = n; i >= 1; i--) {
			int width = 2 * i -1;
			int blankNum = (maxWidth - width) / 2;
			
			for (int times = 0; times < blankNum; times++) {
				System.out.print(" ");
			}

			for (int times = 0; times < width; times++) {
				System.out.print(str);
			}
			
			/* 千万不要打印右侧的空格
			for (int times = 0; times < blankNum; times++) {
				System.out.print(" ");
			}*/

			System.out.println();
		}

		for (i = i + 2; i <= n; i++) {
			int width = 2 * i -1;
			int blankNum = (maxWidth - width) / 2;
			
			for (int times = 0; times < blankNum; times++) {
				System.out.print(" ");
			}
			
			for (int times = 0; times < width; times++) {
				System.out.print(str);
			}

			/*
			for (int times = 0; times < blankNum; times++) {
				System.out.print(" ");
			}
			*/

			System.out.println();
		}

		System.out.println(rest);
	}

}
