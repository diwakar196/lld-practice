package Patterns.Behavioral.ChainOfResponsibility;

public class VerificationProcessor implements Processor {

    public void process() {
        System.out.println("Verified");
    }
}
