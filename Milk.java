public class Milk extends CoffeeDecorator {
    
    private static final double MILK_COST = 25.00;

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // Appends the new addition to the wrapped object's description
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        // Adds the new cost to the wrapped object's cost
        return super.getCost() + MILK_COST;
    }
}
