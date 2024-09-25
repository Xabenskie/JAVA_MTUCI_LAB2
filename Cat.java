public class Cat extends Animal {

	public Cat(String name, int age, double weight) {
			super(name, age, weight);
	}

	@Override
	public void makeSound() {
			System.out.println(getName() + " says: Mew!");
	}

	@Override
	void eat() {
			System.out.println(getName() + " is eating...");
	}
}
