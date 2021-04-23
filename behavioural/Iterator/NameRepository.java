package behavioural.Iterator;

public class NameRepository {
    private String[] names = {"Alex", "Claudiu", "Dan", "Andreea", "Jhon"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
