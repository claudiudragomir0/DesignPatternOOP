package behavioural.TempleteMethod;

// template - it provides what to do
public abstract class Algorithm {

    public abstract void initialize();

    public abstract void sorting();

    public abstract void printResult();

    public void sort() {
        initialize();
        sorting();
        printResult();
    }

}
