package Patterns.Creational.Factory;

public class FactoryB implements Factory{
    public FactoryB() { }

    @Override
    public void funcA() {
        System.out.println("FactoryB::funcA");
    }

    @Override
    public void funcB() {
        System.out.println("FactoryB::funcB");
    }
}
