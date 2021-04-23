package behavioural.Visitor;

//The purpose of a Visitor pattern is to define a new operation without
// introducing the modifications to an existing object structure.
//ComputerPart interface is defining accept operation.
//Keyboard, Mouse, Monitor and Computer are concrete classes implementing ComputerPart interface.
//Interface Visitor will define a visitor class operations.
// Computer uses concrete visitor to do corresponding action.
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
