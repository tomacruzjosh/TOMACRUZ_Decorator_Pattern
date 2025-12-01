public class BlackCoffee implements Coffee {
    
    // Base price for a Black Coffee
    private static final double BASE_COST = 100.00; 

    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double getCost() {
        return BASE_COST;
    }
}
