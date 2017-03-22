package l1_030;

import java.util.Scanner;

public class Main {

	static class Student {
		public int gender;
		public String name;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			int gender = s.nextInt();
			String name = s.next();
			
			students[i] = new Student();
			students[i].gender = gender;
			students[i].name = name;
		}
		s.close();

		int boyIndex = students.length - 1;
		int girlIndex = students.length - 1;

		for (int i = 0; i < students.length / 2; i++) {
			if (students[i].gender == 1) {
				while (students[girlIndex].gender != 0)
					girlIndex--;

				System.out.println(students[i].name + " " + students[girlIndex].name);
				girlIndex--;
			} else {
				while (students[boyIndex].gender != 1)
					boyIndex--;

				System.out.println(students[i].name + " " + students[boyIndex].name);
				boyIndex--;
			}
		}
	}

}
