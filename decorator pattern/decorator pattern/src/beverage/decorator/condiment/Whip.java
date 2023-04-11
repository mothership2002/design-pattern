package beverage.decorator.condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip( Beverage beverage ) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " / 휘핑 크림 추가";
    }

    public double cost() {
        return .10 + beverage.cost();
    }

}