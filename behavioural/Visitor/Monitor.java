package behavioural.Visitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(Visitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
