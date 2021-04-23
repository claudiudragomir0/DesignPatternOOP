package behavioural.Visitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(Visitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
