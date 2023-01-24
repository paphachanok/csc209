public class PetWorld {
	public static void main(String[] args) {
		Pet p1 = new Pet("MuMu", 111, "female");
		System.out.println(p1.name + " " + p1.getGender());

		Pet p2 = new Pet("Bright", 1, "lady");
		System.out.println(p2.name+" "+p2.getGender());
		//p2.gender = "lady boi"; //! this should be private, should not be edited directly
		p2.setGender("lady boi");
		System.out.println(p2.name+" "+p2.getGender());

		p2.setType("rapter");
		System.out.println(p2.getType());

		p2.setType("Unicorn");
		System.out.println(p2.getType());

		Vaccine v1 = new Vaccine("Sinovac", "coVid", "China", 0.12);
		Vaccine v2 = new Vaccine("Sinopharm", "coVaC", "China", 0.22);
		Vaccine v3 = new Vaccine("Banana", "canCer", "USA", 222.22);
		System.out.println(v1.company+ " "+v1.getDose());
		System.out.println(v2.company+ " "+v2.getDose());
		System.out.println(v3.company+ " "+v3.getDose());

		p1.vaccinate(v1);
		p1.vaccinate(v2);
		System.out.println(p1.getVaccineCount());
		System.out.println(p2.getVaccineCount());

		p1.showAllPreventDisease();

	}
}
