package beverage.decorator.condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " / 우유 추가";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }

}
