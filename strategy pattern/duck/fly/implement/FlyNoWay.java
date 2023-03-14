package duck.fly.implement;

import duck.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println( "날지 못함" );

	}

}
