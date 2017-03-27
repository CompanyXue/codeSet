package xl_01;

import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		String ch = s.next();
		s.close();
		
		/*	
		 * 逐行打印沙漏，首位两行符号数目与flag层数相同，逻辑简单，可以直接if选择出来打印，
		 * 每打印一行沙漏都需要一个换行符。然后是上半部分沙漏，逐层递减，根据层数增加，左右各向中间缩进.
		 */
		
		int i = 1;
		for(;;i++){
			if(key<2*(i+1)*(i+1)-1){
				break;
			}
		}
		for(int j=i;j>0;j--){
			for(int blank=i-j;blank>0;blank--){
				System.out.print(" ");
			}
			for(int count=j*2-1;count>0;count--){
				System.out.print(ch);
			}
			System.out.println();
		} 
		
		for(int j=2;j<=i;j++){
			for(int blank=i-j;blank>0;blank--){
				System.out.print(" ");
			}
			for(int count=j*2-1;count>0;count--){
				System.out.print(ch);
			}
			System.out.println();
		} 
		
		System.out.println(key-(2*i*i-1));
	
	}
}