package Patterns.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        SubFactoryA subFactoryA1 = factoryA.makeSubFactoryA();
        SubFactoryA subFactoryA2 = factoryB.makeSubFactoryA();
        SubFactoryB subFactoryB1 = factoryA.makeSubFactoryB();
        SubFactoryB subFactoryB2 = factoryB.makeSubFactoryB();
        subFactoryA1.get();
        subFactoryB1.get();
        subFactoryA2.get();
        subFactoryB2.get();
    }
}
