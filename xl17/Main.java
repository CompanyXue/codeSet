package xl17;

import java.util.Scanner;

// 数太大不可直接得到。样例未通过----TODO 修改
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int num = 0, count = 0;
		int temp = 0;
		float Dist;

		while (n != 0) {
			count++;
			temp = n % 10;
			if (temp == 2)
				num++;
			n = n / 10;
		}
		Dist = temp / count;
		if (n < 0) {
			Dist *= 1.5;
		}
		if (n % 2 == 0) {
			Dist *= 2;
		}
		scan.close();
		System.out.printf("%.2f %%", Dist * 100);
	}
}
//测试用例未通过： 131422233346  