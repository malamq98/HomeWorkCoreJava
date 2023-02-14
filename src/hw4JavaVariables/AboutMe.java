package hw4JavaVariables;

public class AboutMe {
//	Here Variables are declared
	public String name;
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public AboutMe() {
		System.out.println("This is all about us:"); // Constructor declared
	}

	public void aboutme() {
		// Method implemented

		System.out.println("My Name: " + name + "\nAge:" + age + "\nMy Apartment Rent :" + myApartmentRent
				+ "\nMy Yearly Salary :" + myYearlySalary + "\nMy Bank Balance :" + myBankBalance + "\nMy Height :"
				+ myHeight + "\nMy Grade :" + myGrade + "\nSex :" + sex + "\nAm i Us Citizen :" + usCitizen);
	}

}
