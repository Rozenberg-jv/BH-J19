package by.belhard.j19.hw.hw7.task1;

import by.belhard.j19.hw.hw7.task1.pets.Cat;
import by.belhard.j19.hw.hw7.task1.pets.Dog;
import by.belhard.j19.hw.hw7.task1.pets.Fish;
import by.belhard.j19.hw.hw7.task1.pets.Pet;

/*
 * 1.	Написать класс Человек, у которого есть поле "питомец". Питомцы бывают 3х видов: Котик, Собачка и Рыбка. Каждый питомец умеет играть,
 * но делают они этоп о-разному.
 * Котик мяукает, Собака лает и прыгает, Рыбка плавает по кругу. Описать у человека метод, который позволяет играть со своим питомцем,
 * и метод, который позволяет играть с любым питомцем.
 *
 */
public class Main {

	public static void main(String[] args) {

		Pet aDog = new Dog("Rex");
		Pet aCat = new Cat("Murka");
		Pet aFish = new Fish("Toby");

		Master vasily = new Master("Vasily");
		Master eugene = new Master("Eugene");

		vasily.setPet(aDog);
		eugene.setPet(aCat);

		vasily.playWithOwnPet();
		eugene.playWithOwnPet();
		vasily.playWithPet(aFish);
		eugene.playWithPet(vasily.getPet());

	}

}
