package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.repltileInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		;
		Dog dog = new Dog();
		dog.dogInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.repltileInfo();
		cobra.animalInfo();
		System.out.println("\n--------------------------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
	}
}
