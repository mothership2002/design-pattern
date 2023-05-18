package temp.factory.implement;

import temp.factory.AnimalFactory;
import temp.object.Animal;
import temp.object.implement.Dog;

public class DogFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {

		return new Dog();

	}

}
