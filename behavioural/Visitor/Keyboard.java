package behavioural.Visitor;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(Visitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
