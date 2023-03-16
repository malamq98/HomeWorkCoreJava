package hw11Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public static void dorm() {
		System.out.println("Static method of College Interface.");
	}

	public default void studyRoom() {
		System.out.println("Default method of College Interface.");
	}
}
