package l1_010;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[3];
		for (int i = 0; i < 3; i++)
			array[i] = s.nextInt();
		s.close();
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length;i ++)
				System.out.print(array[i] + ((i == array.length -1) ? "": "->"));
	}
}
