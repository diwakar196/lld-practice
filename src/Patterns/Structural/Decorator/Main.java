package Patterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getCost());
        coffee = new MilkCoffeeDecorator(coffee);
        System.out.println(coffee.getCost());
        coffee = new SugarCoffeeDecorator(coffee);
        System.out.println(coffee.getCost());
    }
}
