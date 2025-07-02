package Patterns.Behavioral.ChainOfResponsibility;

public class DispatchProcessor implements Processor {

    public void process() {
        System.out.println("Dispatched");
    }
}
