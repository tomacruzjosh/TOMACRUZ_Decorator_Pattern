public class CaramelSyrup extends CoffeeDecorator {
    
    private static final double CARAMEL_COST = 40.00;

    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        // Appends the new addition to the wrapped object's description
        return super.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        // Adds the new cost to the wrapped object's cost
        return super.getCost() + CARAMEL_COST;
    }
}
