package l1_026;

public class Main {

	public static void main(String[] args) {
		String str = "I Love GPLT";
		
		// update by @stone 
		// char num[] = str.toCharArray(); 
		// 字符串转换，输出每一个char数组元素 
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}
