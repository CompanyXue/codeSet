import java.util.Scanner;
import java.util.Arrays;

//为什么超时？在研究与C的区别。。。（60%正确率）

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		int sum = 0,half = 0;
		
		for(int i=0;i<n;i++){
			array[i] = s.nextInt();
			sum += array[i];
		}
		Arrays.sort(array);
		
		for(int i = 0; i < n / 2; i++)
			half += array[i];
		
		System.out.printf("Outgoing #: %d\n",(n+1)/2);
		System.out.printf("Introverted #: %d\n",n/2);
		System.out.printf("Diff = %d\n",sum - 2 * half);
		
	}
}