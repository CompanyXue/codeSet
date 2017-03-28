package l1_027;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tel = s.next();
		s.close();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < tel.length(); i++) {
			int num = Character.digit(tel.charAt(i), 10);

			if (list.contains(num))
				;
			else
				list.add(num);
		}

		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (a > b)
					return -1;
				else if (a < b)
					return 1;
				else
					return 0;
			}
		});

		System.out.print("int[] arr = new int[]{");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ((i == list.size() -1) ? "" : ","));
		}
		System.out.println("};");
		
		System.out.print("int[] index = new int[]{");
		for (int i = 0; i < tel.length(); i++) {
			int num = Character.digit(tel.charAt(i), 10);
			int index = list.indexOf(num);
			System.out.print(index +   ((i == tel.length() -1) ? "" : ","));
		}
		System.out.println("};");
	}

}
