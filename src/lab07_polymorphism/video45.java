package lab07_polymorphism;

public class video45 {
	public static void main(String[] args) {
		SinhVien it1 = new SinhVienIT(10, 7, "3", "Phuc", 100, 0.1);
		System.out.println("Sinh vien IT score: " + it1.getDiem());

		SinhVien ck1 = new SinhVienCoKhi(8, 8, "1", "Khanh", 100, 0.1);
		System.out.println("Sinh vien co khi scoreL " + ck1.getDiem());
	}

}
