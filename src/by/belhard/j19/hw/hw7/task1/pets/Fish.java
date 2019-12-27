package by.belhard.j19.hw.hw7.task1.pets;

public class Fish extends Pet {

	public Fish(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.println(name + " swims around");
	}
}
