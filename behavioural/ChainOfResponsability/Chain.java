package behavioural.ChainOfResponsability;
/*Chain of responsibility pattern is used to achieve loose coupling in software design where a request from
 the client is passed to a chain of objects to process them
Also, the handler is determined at runtime. Please note that a request not handled at all by any handler is a valid use case.*/

//Handler : This can be an interface which will primarily recieve the request and dispatches the request to chain of handlers.
// It has reference of only first handler in the chain and does not know anything about rest of the handlers.
//        Concrete handlers : These are actual handlers of the request chained in some sequential order.
//        Client : Originator of request and this will access the handler to handle it.
public class Chain {
    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }

}

abstract class Processor {
    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    ;

    public void process(Number request) {
        if (processor != null)
            processor.process(request);
    }

    ;
}

class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}

class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor processor) {
        super(processor);

    }

    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

class TestChain {
    public static void main(String[] args) {
        Chain chain = new Chain();

        //Calling chain of responsibility
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}