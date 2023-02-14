package hw10UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("I am the default constructor of the Father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name :" + name + " Age :" + age + " Sex :" + sex + " Citizenship Status :" + usCitizen);
	}

	public void fatherInfo() {
		System.out.println("I am the void type method of Father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name :" + name + "Age :" + age + "Sex :" + sex + "Citizenship Status :" + usCitizen);
	}

}
