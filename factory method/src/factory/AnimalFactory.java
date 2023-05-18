package temp.factory;

import temp.object.Animal;

public abstract class AnimalFactory {

	public abstract Animal createAnimal();

	public void doSpeakSomeAnimal() {

		Animal animal = createAnimal();
		animal.makeSound();

	}

}
