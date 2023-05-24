package command.classic;

public class Client {

    public static void main(String[] args) {

	OrderReceiver receiver = new OrderReceiver();

	OrderCommand orderCommand = new OrderCommandImpl(receiver, "커피");
	OrderInvoker invoker = new OrderInvoker();

	invoker.setCommand(orderCommand);
	invoker.executeCommand();
    }
}
