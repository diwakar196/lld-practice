package Patterns.Structural.Decorator;

public class SugarCoffeeDecorator implements CoffeeDecorator {
    private Coffee coffee;
    public SugarCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 5;
    }
}
