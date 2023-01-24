public class Vaccine {
	String	name, preventedDisease, company;
	private double	dose;

	public Vaccine(String n, String di) {
		name = n;
		preventedDisease = di;
	}
	public Vaccine(String n, String di, String c, double d) {
		name = n;
		preventedDisease = di;
		company = c;
		setDose(d);
	}

	public void setDose(double d) {
		if (d <= 20.00) {
			dose = d;
		} else {
			dose = 0;
			System.out.println("Dose is not valid");
		}
	}
	public double getDose() {
		return dose;
	}

}
