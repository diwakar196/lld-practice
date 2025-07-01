package Patterns.Structural.Adapter;

public class LegacyPrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;
    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }
    public void print() {
        this.legacyPrinter.print();
    }
}
