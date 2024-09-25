public class Parrot extends Animal {
	
	public Parrot(String name, int age, double weight) {
		super(name, age, weight);
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + " says: Squawk!");
	}
	
	@Override
	void eat() {
		System.out.println(getName() + " is eating...");
	}
}
