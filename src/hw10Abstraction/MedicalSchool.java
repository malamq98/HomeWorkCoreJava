package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	/*Two keywords used extends,implements
	 * one abstract class can inherit one abstract class or a regular class by extend keyword
	 */

	public abstract void anatomy();

	public void biochemistry() { // non abstract method
		System.out.println("I am non abstract method of Medical School");
	}

	public MedicalSchool() { // Yes, we can create Constructor in the Abstract class

	}

}
