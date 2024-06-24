package Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		while (true) {
			System.out.println("Nhập vào 1 số bất kỳ: ");
			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine(); // enter

			System.out.println("Nhập thêm (Y/N)?");
			String options = scanner.nextLine();
			if (options.equals("N") || options.equals("n")) {
				break;
			}

		}

		double sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		System.out.println("Sum is: " + sum);
	}
}
