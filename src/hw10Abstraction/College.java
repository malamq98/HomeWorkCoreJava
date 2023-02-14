package hw10Abstraction;

public interface College {
	
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	public static void dorm() {
	}
	public default void studyRoom() {
	}
}
