package Patterns.Creational.Factory;

public class FactoryA implements Factory{
    public FactoryA() { }

    @Override
    public void funcA() {
        System.out.println("FactoryA::funcA");
    }

    @Override
    public void funcB() {
        System.out.println("FactoryA::funcB");
    }
}
