import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		String ch = s.next();
		s.close();
		
		/*	
		 * ���д�ӡɳ©����λ���з�����Ŀ��flag������ͬ���߼��򵥣�����ֱ��ifѡ�������ӡ��
		 * ÿ��ӡһ��ɳ©����Ҫһ�����з���Ȼ�����ϰ벿��ɳ©�����ݼ������ݲ������ӣ����Ҹ����м�����.
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