package Patterns.Structural.Bridge;

import java.awt.*;

public class Circle implements Shape {
    private Color color;
    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void define() {
        System.out.println(this.color.getColor() + " Circle");
    }
}
