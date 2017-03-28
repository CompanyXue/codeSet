package l2_010;

import java.util.Scanner;

public class Main {

		static int []keyLeft= new int[100];
		static int []keyRight= new int[100];
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt(); //参宴的宾客总人数
			int m = s.nextInt(); //已知的两两宾客之间的关系数
			int k = s.nextInt(); //查询的条数
		
			System.out.println();
			// @TODO
			
			for(int i=0;i<m;i++){
				
			}
			for(int i=0;i<k;i++){
				keyLeft[i] = s.nextInt();
				keyRight[i] = s.nextInt();
			}
			
			s.close();
		}

}
