package command.order;

public class RealOrder implements Order {
    Cook cook;
    private String food;

    public RealOrder(Cook cook, String wantFood) {
	this.cook = cook;
	this.food = wantFood;
    }

    @Override
    public void orderUp() {
	cook.makeSomething(food);
    }
}
