package by.belhard.j19.hw.hw7.task1.pets;

public abstract class Pet {

	final String name;

	Pet(String name) {

		this.name = name;
	}

	public abstract void play();

	@Override
	public String toString() {

		return name;
	}
}
