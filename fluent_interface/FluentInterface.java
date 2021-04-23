package fluent_interface;

interface Readable {
    void read();
}

public class FluentInterface {
    public static void main(String[] args) {
        Readable scienceImplementation = new ScienceBook();
        scienceImplementation.read();
        Readable economicImplementation = new EconomicBook();
        economicImplementation.read();
    }
}

class ScienceBook implements Readable {
    @Override
    public void read() {
        System.out.println("I read science!");
    }
}

class EconomicBook implements Readable {
    @Override
    public void read() {
        System.out.println("I read economic!");
    }
}