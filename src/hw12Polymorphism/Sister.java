package hw12Polymorphism;
/*Method Overloading : same method name with different parameters
 ---same method name with different orientations
 ---Final and Static methods only be return type , it can't be void type 
 */

public class Sister {

	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("My sister age is :" + total1);
	}

	public void sister(int age1, int age2, int age3, int age5, int age6) {
		int total2 = age1 + age2 + age3 + age5 + age6;
		System.out.println("My sister age is :" + total2);
	}

	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("My sister age is :" + total3);
	}

	public int sister(int age2, int age3, String age4, int age5) {
		int total4 = age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("My sister age is :" + total4);
		return total4;
	}

	public int sister(int age3, String age4, int age5) {
		int total5 = age3 + Integer.parseInt(age4) + age5;
		System.out.println("My sister age is :" + total5);
		return total5;
	}

	public final int sister(int age3, String age4) {
		int total6 = age3 + Integer.parseInt(age4);
		System.out.println("My sister age is :" + total6);
		return total6;

	}

	public static int sister(String age4, int age5) {
		int total7 = Integer.parseInt(age4) + age5;
		System.out.println("My sister age is :" + total7);
		return total7;

	}

	public final int sister(int age1, int age5) {
		int total8 = age1 + age5;
		System.out.println("My sister age is :" + total8);
		return total8;
	}

}
