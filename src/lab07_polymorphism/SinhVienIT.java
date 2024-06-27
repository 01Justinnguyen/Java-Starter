package lab07_polymorphism;

public class SinhVienIT extends SinhVien {
	private double scoreJava, scoreHTML;

	public SinhVienIT(double scoreJava, double scoreHTML, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getDiem() {
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}
