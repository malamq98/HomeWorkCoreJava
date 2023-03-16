package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String opeartingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");
	}
	public Computer(String brand, String model, String opeartingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.opeartingSystem = opeartingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand :" + brand + ", Model :" + model + ", OpeartingSystem :" + opeartingSystem
				+ ",Price :" + price + ",Grade :" + grade + ",MadeInUsa Ans :" + madeInUSA);
	}
	public Computer(String brand, int price) {
		this.brand = brand;
		this.price = price;
		System.out.println("Brand is " + brand + " Price :" + price);
	}
	public Computer(String model, char grade) {
		this.model = model;
		this.grade = grade;
		System.out.println("Model :" + model + " Grade :" + grade);
	}
}
