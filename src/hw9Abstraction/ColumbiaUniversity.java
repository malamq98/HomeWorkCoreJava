package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool{ // chemistry and biology
	
//	Can a regular Class inherit another Abstract Class or a regular class or interface by extends key word?
	// Ans: Yes, a regular class can inherit another abstract class or a regular by a extends key word, not an interface
	//How many inheritances are possible by a regular Class?
	//Ans: only one
	// public abstract void chemistry(); /Abstract method only can not define in a regular class
	
	public void biology() {
		System.out.println("I am the non abstract method of Columbia Unviersity");
	}
	public ColumbiaUniversity () {
		
	}
	@Override
	public void anatomy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}
