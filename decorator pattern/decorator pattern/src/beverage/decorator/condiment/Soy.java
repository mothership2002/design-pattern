package beverage.decorator.condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy( Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " / 간장 추가";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }

}