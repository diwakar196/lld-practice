package Patterns.Behavioral.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ProcessHandler {
    private List<Processor> processors;
    public ProcessHandler() {
        this.processors = new ArrayList<>();
        this.processors.add(new VerificationProcessor());
        this.processors.add(new DispatchProcessor());
    }

    public void process() {
        for(Processor processor : this.processors) {
            processNext(processor);
        }
    }

    private void processNext(Processor processor) {
        processor.process();
    }

}
