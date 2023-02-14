package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{ // chemistry and biology
	
//	Can a regular Class inherit another Abstract Class or a regular class or interface by extends key word?
	// Ans: Yes, a regular class can inherit another abstract class or a regular by a extends key word, not an interface
	//How many inheritances are possible by a regular Class?
	//Ans: only one
	// a regular class can  inherit one or more than one interfaces by using implements key word
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
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
}
