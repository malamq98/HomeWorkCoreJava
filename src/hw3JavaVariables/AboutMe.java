package hw3JavaVariables;

public class AboutMe {
	public String fullName; // Variable declared
	public String name = "Md Alam"; // Variable initialized
	public char sex = 'M';
	public boolean asian = true;
	public byte age = 33;
	public short zipCode = 12345;
	public long salary = 1000000l;
	public int myBannkBalance = 350000000;
	public float myHeight = 5.78965f;
	public double myArea = 3.12345678912345;

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();

		System.out.println(aboutme.name);
		System.out.println("My Name :" + aboutme.name + "\nAge :" + aboutme.age + "\nArea Zipcode:" + aboutme.zipCode);

	}
}
