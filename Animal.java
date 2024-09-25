public abstract class Animal {
	// Поля 
	private String name;
	private int age;
	private double weight;

	// Конструктор
	public Animal(String name, int age, double weight) {
			this.name = name;
			this.age = age;
			this.weight = weight;
	}

	// Абстрактный метод
	abstract void eat();
	abstract void makeSound();

	// Геттеры и сеттеры
	public String getName() {
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public int getAge() {
			return age;
	}

	public void setAge(int age) {
			this.age = age;
	}

	public double getWeight() {
			return weight;
	}

	public void setWeight(double weight) {
			this.weight = weight;
	}
}
