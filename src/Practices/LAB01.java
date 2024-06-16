package Practices;

import java.util.Scanner;

// Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím. In ra màn hình
// với định dang <tên_sinh_viên> có điểm = <điểm>
public class LAB01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		double score;
		System.out.println("Enter your name: ");
		name = scanner.next();
		System.out.println("Enter your score: ");
		score = scanner.nextDouble();
		System.out.println(name + " Có điểm = " + score);
	}
}
