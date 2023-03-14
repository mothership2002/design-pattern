package duck;

import duck.fly.implement.FlyWithWings;
import duck.quack.implement.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println( "물오리 입니다." );
	}

}
