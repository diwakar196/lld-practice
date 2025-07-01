package Patterns.Structural.Adapter;

public class LatestPrinter implements Printer {
    public void print() {
        System.out.println("Latest printer");
    }
}
