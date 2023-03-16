package hw10Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public static void morgue() {
		System.out.println("Static method of Hospital Interface.");
	}

	public default void pharmacy() {
		System.out.println("Default method of Hospital Interface.");
	}
}
