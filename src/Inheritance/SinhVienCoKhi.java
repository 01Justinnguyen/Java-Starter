package Inheritance;

public class SinhVienCoKhi extends SinhVien {
	private String skill;

	public SinhVienCoKhi(String skill, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

}
