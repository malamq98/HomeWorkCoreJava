package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Alam", 50, 'M', true);
		System.out.println("I am the default constructor of the Child class");
	}

	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month :" + birthMonth + "Daughter Age :" + age);
	}

	public void daughterInfo() {
		System.out.println("I am the void method of daughter classs");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.familyName = "Md Alam";
		super.age = 50;
		super.sex = 'M';
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month :" + birthMonth + " Daughter Age :" + age);
	}

}
