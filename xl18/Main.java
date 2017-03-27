
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		String s= "Dang";
		String str = "";
		String []temp = new String[2];
		int array[] = new int[2];
		
		Scanner scan = new Scanner(System.in);
		String buf = scan.next();
		temp = buf.split(":");
		for(int i =0;i<2;i++)
			array[i] = Integer.parseInt(temp[i]);
		
		if(array[0]>12 && array[0]<24){
			int num = array[0]-12;
			while(num!=0){
				str = str+s;
				num--;
			}
			if(array[1]==0)
				System.out.println(str);
			else
				System.out.println(str+s);
		}else
		if(array[0]<11 && array[0]>=0 || array[0] ==11 && array[1]<=59 &&array[1]>=0 || array[0] ==12 &&array[1] ==0){
			System.out.println("Only "+buf+".  Too early to Dang.");
		}	
 	}

}