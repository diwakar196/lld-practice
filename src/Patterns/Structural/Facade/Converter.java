package Patterns.Structural.Facade;

public class Converter {
    public void convert() {
        convertA();
        convertB();
        convertC();
    }

    private void convertA() {
        ConvertA c = new ConvertA();
        c.doIt();
    }

    private void convertB() {
        ConvertB c = new ConvertB();
        c.doIt();
    }

    private void convertC() {
        ConvertC c = new ConvertC();
        c.doIt();
    }
}
