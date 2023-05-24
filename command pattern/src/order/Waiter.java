package command.order;

public class Waiter {
    Order order;

    public void takeOrder(Order order) {
	this.order = order;
	order.orderUp();
    }
}
