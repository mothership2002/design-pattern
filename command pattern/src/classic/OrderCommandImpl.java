package command.classic;

public class OrderCommandImpl implements OrderCommand {

    private final OrderReceiver receiver;
    private final String item;

    public OrderCommandImpl(OrderReceiver receiver, String item) {
	this.receiver = receiver;
	this.item = item;
    }

    @Override
    public void execute() {
	receiver.placeOrder(item);
    }

}
