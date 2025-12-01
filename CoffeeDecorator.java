public abstract class CoffeeDecorator implements Coffee {
    
    // Reference to the wrapped component (which is also a Coffee)
    protected Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }
    
    // By default, the Decorator methods simply call the wrapped object's methods.
    // Concrete decorators will override these to add their own logic.
    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost();
    }
}
