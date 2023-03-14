package duck.quack.implement;

import duck.quack.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {

		System.out.println( "삑" );

	}

}
