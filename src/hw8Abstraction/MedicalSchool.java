package hw8Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomy();

	public void biochemistry() { // non abstract method
		System.out.println("I am non abstract method of Medical School");
	}

	public MedicalSchool() { // Yes, we can create Constructor in the Abstract class

	}

}
