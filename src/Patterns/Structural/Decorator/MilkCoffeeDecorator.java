package Patterns.Structural.Decorator;

public class MilkCoffeeDecorator implements CoffeeDecorator {
    private Coffee coffee;
    public MilkCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 5;
    }
}
