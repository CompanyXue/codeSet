package l2_017;

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
		s.close();
		
		Arrays.sort(array);
		
		for(int i = 0; i < n / 2; i++){
			//half += array[i];
			//此处不必在此运算half为多少，直接退换为sum的计算，减少运算时间
			sum -= 2*array[i];
		}
		
		System.out.printf("Outgoing #: %d\n",(n+1)/2);
		System.out.printf("Introverted #: %d\n",n/2);
		//System.out.printf("Diff = %d\n",sum - 2 * half);
		System.out.printf("Diff = %d\n",sum);
		
	}
}