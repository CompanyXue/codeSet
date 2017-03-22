import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String A = s.next();
		String B = s.next();
		s.close();
				
		System.out.printf("%d +%d = %d",A,B,A+B);
	}

}