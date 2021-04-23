package behavioural.Iterator;

//      This is used to get a way to access the elements of a collection object in sequential manner without any need to
// know its underlying representation.
//      Helps building an application that requires us to maintain a list of notifications. Eventually, some part of
// your code will require to iterate over all notifications. If we implemented your collection of notifications as
// array you would iterate over.
public class IteratorPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println(name);
        }
    }
}
