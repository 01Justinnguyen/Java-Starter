package lab07_polymorphism;

public class SinhVienCoKhi extends SinhVien {
	private double scoreCNC, scorePLC;

	public SinhVienCoKhi(double scoreCNC, double scorePLC, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	@Override
	double getDiem() {
		return (this.scoreCNC + this.scorePLC) / 2;
	}

}
