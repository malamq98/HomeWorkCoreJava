package hw10Abstraction;

public interface University extends College, Hospital {
	/*
	 * one keyword used extends one interface can extends more than one interface by
	 * extends keyword Interface can't extend with a regular class or abstract class
	 * by extends keyword
	 */

	public void classSize();

	public void playGround();

	public void teacher();

//public University() { Interface can not have a constructor}

	public static void library() {
		System.out.println("Static method of University Interface.");
	}

	public default void gymnasium() {
		System.out.println("Default method of University Interface.");
	}
}
