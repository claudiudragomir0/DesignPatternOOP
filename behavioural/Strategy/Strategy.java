package behavioural.Strategy;

interface InterfaceStrategy {
    void operation(int num1, int num2);
}

public class Strategy {
    public static void main(String[] args) {
        Manager manager = new Manager();
//        The Strategy design pattern is widely used. Its intent is to encapsulate alternative
//        strategies for a particular operation. The Strategy pattern is a „plug-and-play‟ pattern.
//                The client calls a method on a particular interface which can be swapped out with any
//                other Strategy class that implements the same interface. Strategy is useful in many
//        different scenarios. An example is credit card processing. If a customer on an
//        eShopping site prefers to pay with PayPal over 2Checkout the application can simply
//        swap the PayPal strategy class out for the 2Checkout strategy class.
        manager.setInterfaceStrategy(new Addition());
        manager.setInterfaceStrategy(new Multiply());
        manager.operation(2, 3);

    }
}

class Manager implements InterfaceStrategy {
    private InterfaceStrategy interfaceStrategy;

    public void setInterfaceStrategy(InterfaceStrategy interfaceStrategy) {
        this.interfaceStrategy = interfaceStrategy;
    }

    @Override
    public void operation(int num1, int num2) {
        this.interfaceStrategy.operation(num1, num2);
    }
}

class Addition implements InterfaceStrategy {
    @Override
    public void operation(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

class Multiply implements InterfaceStrategy {
    @Override
    public void operation(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}