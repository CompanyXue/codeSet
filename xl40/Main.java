import java.util.Scanner;  

public class Main{
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		String str[] = new String[n];
		float num[] = new float[n];
		
		for(int i=0;i<n;i++){
			str[i] = scan.next();
			num[i] = scan.nextFloat();
		}
		
		for(int i=0;i<n;i++){
			if(str[i].equals("M")){
				System.out.printf("%.2f\n",num[i]/1.09);
			}else{
				System.out.printf("%.2f\n",num[i]*1.09);
			}
			
		}
		
	}
}