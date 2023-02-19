package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sis = new Sister();
		sis.sister(20, 30, 40, "100", 33, 12);
		sis.sister(14, 5, 7, 55, 19);
		sis.sister(100, 50);// final method
		sis.sister(55, "600");
		sis.sister(20, 30, 40, "100", 33);
		sis.sister(100, "200", 2);
		sis.sister(25, 30, "35", 55);
		Sister.sister("200", 20);// static method
		System.out.println("\n---------------------Niece Class--------------------------------------------");
		Niece nc = new Niece();
		nc.sister(5, 10);
		nc.sister(100, "1000");
		nc.sister(25, "35", 50);
		nc.sister(12, 25, "222", 90);
		nc.sister(12, 25, 38, 33, 50);
		nc.sister(20, 30, 40, "100", 33, 12);

	}

}
