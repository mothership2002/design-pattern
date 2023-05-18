package temp.factory.implement;

import temp.factory.AnimalFactory;
import temp.object.Animal;
import temp.object.implement.Cat;

public class CatFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {

		return new Cat();

	}

}
