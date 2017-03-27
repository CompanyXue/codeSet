package xl28;

import java.util.Scanner;  
   
public class Main {  
  
    public static void main(String[] args) {  
  
        Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		scan.close();
        int num[] = new int[n];
        
        for(int i = 0;i < n;i++){
                num[i] = scan.nextInt();  
                if (isPrime(num[i])) {
                        System.out.println("Yes");
                } else {  
                        System.out.println("No");
                }  
        } 
    
    }  

    public static boolean isPrime(int a) {  
  
        boolean flag = true;  
  
        if (a < 2) {
            return false;  
        } else {  
  
            for (int i = 2; i <= Math.sqrt(a); i++) {  
  
                if (a % i == 0) {
  
                    flag = false;  
                    break;
                }  
            }  
        }  
        return flag;  
    }  
}  
