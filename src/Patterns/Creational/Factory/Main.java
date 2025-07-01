package Patterns.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        factoryA.funcA();
        factoryA.funcB();
        factoryB.funcA();
        factoryB.funcB();
    }
}
