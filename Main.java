public class Main {
	public static void main(String[] args) {
			Cat myCat = new Cat("Whiskers", 3, 4.5);
			myCat.makeSound();
			myCat.eat();

			Parrot myParrot = new Parrot("Polly", 2, 1.5);
			myParrot.makeSound();
			myParrot.eat();

			Fish myFish = new Fish("Bubbles", 1, 0.1);
			myFish.makeSound();
			myFish.eat();
			System.out.println("Total objects was created: " + Animal.getCount());
	}
}
