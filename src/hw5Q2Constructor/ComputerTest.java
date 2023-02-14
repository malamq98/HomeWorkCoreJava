package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer01 = new Computer();
		Computer computer02 = new Computer("Apple", "HP", "Windows10", 800, 'A', false);
		Computer computer03 = new Computer("Apple", "HP1", "Windows 8", 800, 'B', true);
		Computer computer04 = new Computer("V600", 'A');
		Computer computer05 = new Computer("Dell", 800);
	}
}
