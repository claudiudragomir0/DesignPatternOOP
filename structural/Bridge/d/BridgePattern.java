package structural.Bridge.d;

interface Color {
    void fillColor();
}

public class BridgePattern {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.fill();
//        Shape pentagon = new Pentagon(new GreenColor());
//        pentagon.fill();
    }
}

abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void fill();
}

class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void fill() {
        System.out.print("Triangle filled with color ---");
        color.fillColor();
    }
}

class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void fill() {
        System.out.print("Pentagon filled with color ");
        color.fillColor();
    }
}

class RedColor implements Color {
    public RedColor() {
        System.out.println("constructor RedColor");
    }

    @Override
    public void fillColor() {
        System.out.println("red.");
    }
}

class GreenColor implements Color {
    public GreenColor() {
        System.out.println("constructor GreenColor");
    }

    @Override
    public void fillColor() {
        System.out.println("green.");
    }
}