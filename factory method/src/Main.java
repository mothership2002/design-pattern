package temp;

import temp.factory.AnimalFactory;
import temp.factory.implement.CatFactory;
import temp.factory.implement.DogFactory;

public class Main {

	public static void main( String[] args ) {

		AnimalFactory factory = new DogFactory();
		factory.doSpeakSomeAnimal();

		factory = new CatFactory();
		factory.doSpeakSomeAnimal();

	}

}
