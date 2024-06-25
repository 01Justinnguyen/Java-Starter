package String;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {
		Student std1 = new Student("Nguyen Thanh Phuc", "1");
		Student std2 = new Student("Tran Thanh Tam", "2");
		Student std3 = new Student("Vo Thanh Dung", "3");
		Student std4 = new Student("Pham Quang Thanh Huy", "4");
		Student std5 = new Student("Nguyen Pham Tuong Thanh Khanh", "5");

		ArrayList<Student> arrStd = new ArrayList<Student>();
		arrStd.add(std1);
		arrStd.add(std2);
		arrStd.add(std3);
		arrStd.add(std4);
		arrStd.add(std5);

		for (Student i : arrStd) {
			if (i.getName().startsWith("Nguyen")) {
				System.out.println(i);
			}
		}
	}
}
