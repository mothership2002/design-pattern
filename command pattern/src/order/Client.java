package command.order;

public class Client {
    Waiter waiter;
    Order order;

    public Client(Waiter waiter) {
	this.waiter = waiter;
    }

    public void createOrder(Order order) {
	this.order = order;
    }

    public void hungry() {
	waiter.takeOrder(order);
    }
}
