package duck.huntersCall;

import duck.quack.implement.Quack;

public class CallDevice {

	Quack quack = new Quack();

	public void lure( int number ) {

		for ( int i = 0 ; i < number ; i++ ) {
			quack.quack();
		}

	}

}
