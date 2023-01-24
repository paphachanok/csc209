import java.util.Date;

public class Pet {
	String				name;
	private String		type, gender;
	Date				dateOfbirth;
	String[]			colors;
	int					id;
	Owner				owner;
	private Vaccine[]	vaccines;
	private int			vaccineCount;

	public Pet(String n, int i, String g) {
		name = n;
		id = i;
		setGender(g); //gender = g;
		//* it shold create array at the beginning */
		vaccines = new Vaccine[100];
		vaccineCount = 0;
	}

	public void setGender(String g) {
		if (g.equalsIgnoreCase("male") || g.equalsIgnoreCase("female"))
			gender = g;
		else {
			System.out.println("Animals gender are only male or female");
			gender = "unknown";
		}
	}
	public String getGender() {
		return (gender);
	}

	public boolean setType(String t) {
		String[] typeList = { "dog", "fish", "rabbit", "bird", "chicken",
				"python", "rapter", "worm", "cricket"};

		for (int i = 0; i < typeList.length; i++) {
			if (t.equalsIgnoreCase(typeList[i])) {
				type = t;
				return true;
			}
		}
		type = "Undiscoverd spicies";
		return false;
	}
	public String getType() {
		return (type);
	}

	public int vaccinate(Vaccine v) {
		vaccines[vaccineCount] = v;
		vaccineCount++;
		return vaccineCount;
	}

	public int getVaccineCount() {
		return vaccineCount;
	}

	public void showAllPreventDisease() {
		// for (Vaccine v : vaccines) {
		// 	System.out.print(v.preventedDisease + " ");
		// }
		// System.out.println(vaccines.length);
		for (int i = 0; i < vaccineCount; i++) {
			System.out.print(vaccines[i].preventedDisease + " ");
		}
	}

}
