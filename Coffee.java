public interface Coffee {
    /**
     * @return A string listing all ingredients/components in the coffee order.
     */
    String getDescription();
    
    /**
     * @return The total cost of the coffee order.
     */
    double getCost();
}
