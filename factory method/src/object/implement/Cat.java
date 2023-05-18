package temp.object.implement;

import temp.object.Animal;

public class Cat implements Animal {

	@Override
	public void makeSound() {

		System.out.println( "대충 하악질하는 소리" );

	}

}
