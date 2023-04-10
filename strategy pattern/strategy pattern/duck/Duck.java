package duck;

import duck.fly.FlyBehavior;
import duck.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println( "수영 중" );
    }

    public void setFlyBehavior( FlyBehavior fly ) {
        this.flyBehavior = fly;
    }

    public void setQuackBehavior( QuackBehavior quack ) {
        this.quackBehavior = quack;
    }

}
