import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
		int c = 5*(n-32)/9;
		
		System.out.printf("Celsius = %d",c);
	}

}
