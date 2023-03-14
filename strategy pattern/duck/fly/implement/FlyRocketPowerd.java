package duck.fly.implement;

import duck.fly.FlyBehavior;

public class FlyRocketPowerd implements FlyBehavior {

	@Override
	public void fly() {

		System.out.println( "로켓 추진으로 비행 중" );

	}

}
