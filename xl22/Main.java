import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    int array[] = new int[1000];
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int numOfJishu=0,numOfOushu=0;
    
    for(int i =0;i<num;i++){
       array[i] = scan.nextInt();
       if(array[i]%2==0){
         numOfOushu++;
       }else{
         numOfJishu++;
       }
    }
    System.out.println(numOfJishu+" "+numOfOushu);  
   }

}