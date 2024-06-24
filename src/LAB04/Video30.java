package LAB04;

public class Video30 {
	public static void main(String[] args) {
		System.out.println("Run product");
		Product test = new Product();

		Product pr1 = test.nhapThongTin("Computer", 200, 10);
		test.xuatThongTin(pr1);
		double taxPrice = test.getTaxPrice(pr1.getPrice(), pr1.getTax());

		System.out.println("getTaxPrice: " + taxPrice);
	}
}
