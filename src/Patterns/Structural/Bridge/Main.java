package Patterns.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(new Red());
        Shape s2 = new Square(new Red());
        Shape s3 = new Circle(new Blue());
        Shape s4 = new Square(new Blue());
        s1.define();
        s2.define();
        s3.define();
        s4.define();
    }
}
