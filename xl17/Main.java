package xl17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		s.close();
		
		int totalLength = n.length();
		int twoCount = 0;
		boolean negativeFlag = false;
		
		if (n.charAt(0) == '-') {
			totalLength -= 1;
			negativeFlag = true;
		}
		
		for (char c : n.toCharArray()) {
			if (c == '2')
				twoCount += 1;
		}
		
		double result = twoCount * 1.0 / totalLength;
		
		if (negativeFlag) 
			result *= 1.5;
		
		char lastChar = n.charAt(n.length() -1);
		if (Character.digit(lastChar, 10) % 2 == 0)
			result *= 2;
		
		System.out.printf("%.2f%%", result * 100);
	}

}

