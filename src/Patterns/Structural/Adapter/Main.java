package Patterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new LatestPrinter();
        Printer p2 = new LegacyPrinterAdapter(new LegacyPrinter());
        p1.print();
        p2.print();
    }
}
