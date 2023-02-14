package hw10UseOfSuperInChildClass;

public class TestFamilyClass {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		Daughter daughter2 = new Daughter("june", 30);
		daughter.fatherInfo();
		daughter.daughterInfo();
		daughter.daughterInfo("June", 30);

	}

}
