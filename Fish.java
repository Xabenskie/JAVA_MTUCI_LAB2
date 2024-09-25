public class Fish extends Animal {
	
	public Fish(String name, int age, double weight) {
		super(name, age, weight);
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + " says: ...");
	}
	
	@Override
	void eat() {
		System.out.println(getName() + " is eating...");
	}
	
}
