package hw10Abstraction;

public interface University extends College,Hospital {
	/*  one keyword used extends
	 * one interface can extends more than one interface by extends keyword
	 * Interface can't extend with a regular class or abstract class by extends keyword
	*/
	
public void classSize();
public void playGround();
public void teacher();

//public University() { Interface can not have a constructor}

public static void library() {
}
public default void gymnasium() {
}
}
