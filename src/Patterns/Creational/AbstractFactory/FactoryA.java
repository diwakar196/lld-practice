package Patterns.Creational.AbstractFactory;

public class FactoryA implements Factory {

    public SubFactoryA makeSubFactoryA() {
        return new SubFactoryA1();
    }

    public SubFactoryB makeSubFactoryB() {
        return new SubFactoryB1();
    }
}
