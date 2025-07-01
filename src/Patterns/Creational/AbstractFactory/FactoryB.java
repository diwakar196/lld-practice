package Patterns.Creational.AbstractFactory;

public class FactoryB implements Factory{

    @Override
    public SubFactoryA makeSubFactoryA() {
        return new SubFactoryA2();
    }

    @Override
    public SubFactoryB makeSubFactoryB() {
        return new SubFactoryB2();
    }
}
