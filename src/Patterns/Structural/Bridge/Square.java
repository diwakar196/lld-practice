package Patterns.Structural.Bridge;

import java.awt.*;

public class Square implements Shape {
    private Color color;
    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void define() {
        System.out.println(this.color.getColor() + " Square");
    }
}
