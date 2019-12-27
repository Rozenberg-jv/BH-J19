package by.belhard.j19.hw.hw7.task1.pets;

public class Dog extends Pet {

	public Dog(String name) {

		super(name);

	}

	@Override
	public void play() {

		System.out.println(super.name + " says \"Woof-woof\"");
	}
}
