package by.belhard.j19.hw.hw7.task1.pets;

public class Cat extends Pet {

	public Cat(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.println(super.name + " says \"Meow-meow\"");
	}
}
