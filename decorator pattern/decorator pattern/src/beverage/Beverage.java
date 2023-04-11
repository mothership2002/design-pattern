package beverage;

public abstract class Beverage {
    public String description = "Unknown beverage.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}