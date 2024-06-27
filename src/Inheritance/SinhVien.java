package Inheritance;

public abstract class SinhVien {
	protected String id; // mã số sinh viên
	protected String name; // tên
	protected double price; // học phí
	protected double tax; // tỉ lệ thuế

	abstract void tinhDiem();

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public void info() {
		System.out.println("Run info from parent");
	}
}
