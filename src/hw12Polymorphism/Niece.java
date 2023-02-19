package hw12Polymorphism;

/*
 Method override: Same method name with same parameters but different syntax or logic
 --- Must use keyword @Override 
 --- can't Override final and static method from parent class
 */

public class Niece extends Sister {

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 + 10;// 10 is logic
		System.out.println("My sister age is :" + total1);
	}

	@Override
	public void sister(int age1, int age2, int age3, int age5, int age6) {
		int total2 = age1 + age2 + age3 + age5 + age6 * 2; // 2 is logic
		System.out.println("My sister age is :" + total2);
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + 3;
		System.out.println("My sister age is :" + total3);
	}

	@Override
	public int sister(int age2, int age3, String age4, int age5) {
		int total4 = age2 + age3 + Integer.parseInt(age4) + age5 / 6;
		System.out.println("My sister age is :" + total4);
		return total4;
	}

	@Override
	public int sister(int age3, String age4, int age5) {
		int total5 = age3 + Integer.parseInt(age4) + age5 - 2;
		System.out.println("My sister age is :" + total5);
		return total5;
	}
	/*
	 * @Override public final int sister(int age3, String age4) { int total6 = age3
	 * + Integer.parseInt(age4); System.out.println("My sister age is :" +
	 * total6);// final type method can't override return total6;
	 */
	/*
	 * @Override public static int sister(String age4, int age5) { int total7 =
	 * Integer.parseInt(age4) + age5; System.out.println("My sister age is :" +
	 * total7);//static method can't override return total7;
	 * 
	 * }
	 */

}
