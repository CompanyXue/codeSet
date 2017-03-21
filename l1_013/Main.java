package l1_013;

import java.util.Scanner;

public class Main {

	public static int fac(int n) {
		int res = 1;
		for (int i = 1; i <= n;i++)
			res *= i;
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		int sum = 0;
		for (int i = 1; i <=n ; i++ )
			sum += fac(i);
		
		System.out.print(sum);
	}
}
