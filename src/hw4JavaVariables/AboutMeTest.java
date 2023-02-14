package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
//		Variables are initialized
//		 Class and Constructor are instantiated 

		AboutMe alam = new AboutMe();
		alam.name = "Md Alam";
		alam.age = 90;
		alam.myApartmentRent = 32500;
		alam.myYearlySalary = 123456789;
		alam.myBankBalance = 987654321233l;
		alam.myHeight = 6.9876f;
		alam.myGrade = 3.88889878;
		alam.sex = 'M';
		alam.usCitizen = true;
		alam.aboutme();// Method is initialized

		System.out.println("\n-----------------------------------S----------------------------------------------\n");

		AboutMe alex = new AboutMe();

		alex.name = "Alex";
		alex.age = 50;
		alex.myApartmentRent = 30000;
		alex.myYearlySalary = 987655432;
		alex.myBankBalance = 9876543219l;
		alex.myHeight = 7.8987f;
		alex.myGrade = 3.98976534;
		alex.sex = 'M';
		alex.usCitizen = false;
		alex.aboutme();

	}

}
