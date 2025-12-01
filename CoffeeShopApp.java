public class CoffeeShopApp {
    
    public static void main(String[] args) {
        
        System.out.println("--- Brewtiful Coffee Orders ---");
        
        // 1. Simple Black Coffee
        Coffee basicCoffee = new BlackCoffee();
        System.out.println("\nOrder 1:");
        System.out.printf("Description: %s%n", basicCoffee.getDescription());
        System.out.printf("Total Cost: ₱%.2f%n", basicCoffee.getCost());

        // 2. Black Coffee with Milk
        // The Milk decorator wraps the BlackCoffee object.
        Coffee milkCoffee = new Milk(new BlackCoffee());
        System.out.println("\nOrder 2 (Milk):");
        System.out.printf("Description: %s%n", milkCoffee.getDescription());
        System.out.printf("Total Cost: ₱%.2f%n", milkCoffee.getCost());
        
        // 3. Black Coffee with Milk AND Caramel Syrup (Chaining Decorators)
        // CaramelSyrup wraps Milk, and Milk wraps BlackCoffee.
        Coffee customCoffee = new CaramelSyrup(new Milk(new BlackCoffee()));
        System.out.println("\nOrder 3 (Milk + Caramel Syrup):");
        System.out.printf("Description: %s%n", customCoffee.getDescription());
        System.out.printf("Total Cost: ₱%.2f%n", customCoffee.getCost());
    }
}
