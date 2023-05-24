package command.order;

public class Diner {
    public static void main(String[] args) {
	Cook cook = new Cook(); // 집행자
	Waiter waiter = new Waiter();
	Client customer = new Client(waiter);
	customer.createOrder(new RealOrder(cook, "비빔밥"));
	customer.hungry();
    }
}
