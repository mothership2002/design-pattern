package beverage.decorator.condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha( Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " / 모카 추가";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}