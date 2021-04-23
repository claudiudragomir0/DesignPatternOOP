package behavioural.TempleteMethod;

//      Template Method is a behavioral design pattern that allows you to defines a skeleton of an algorithm in a base
// class and let subclasses override the steps without changing the overall algorithm's structure.
//      In template pattern, an abstract class eposes defined way/template to execute its methods.
//      Its sublcasses can override the method implementation as per need but the invocation is to be in the samme way
// as defined by abstract class
//      The template method is used in frameworks, where each implements the invariant parts of a domain’s architecture,
// leaving “placeholders” for customization options.
//      The template method is used for the following reasons :
//      Let subclasses implement varying behavior (through method overriding)
//      Avoid duplication in the code, the general workflow structure is implemented once in the abstract class’s
// algorithm, and necessary variations are implemented in the subclasses.
//        Control at what points subclassing is allowed. As opposed to a simple polymorphic override, where the base
// method would be entirely rewritten allowing radical change to the workflow, only the specific details of the
// workflow are allowed to change.
public class TempleteMethodPattern {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 235, -235, 23, 523, 56};
        //Algorithm sortAlgorithm = new BubbleSort(numbers);
        Algorithm sortAlgorithm = new InsertionSort(numbers);
        sortAlgorithm.sort();
    }
}
