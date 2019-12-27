package by.belhard.j19.hw.hw7.task1;

import by.belhard.j19.hw.hw7.task1.pets.Pet;

public class Master {

	private final String name;

	private Pet pet;

	public Master(String name) {

		this.name = name;
	}

	public void playWithPet(Pet pet) {

		if (pet != null) {
			System.out.printf("%s plays with %s: ", this.name, pet);
			this.pet.play();
		} else
			System.out.println(this.name + " have no pet");
	}

	public void playWithOwnPet() {

		this.playWithPet(this.pet);
	}

	public void setPet(Pet pet) {

		this.pet = pet;
	}

	public Pet getPet() {

		return pet;
	}
}
