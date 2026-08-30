public class ProductInventory{
    public static void main(String[] args) {

        Product p1 = new Product("P101", "Laptop", 50000);
        Product p2 = new Product("P102", "Mouse", 800, 10);
        Product p3 = new Product("P103", "Keyboard", 1500, 5);

        p1.restock(3);

        System.out.println(p1);
        System.out.println("Sell 2: " + p1.sell(2));
        System.out.println("Inventory Value: " + p1.getInventoryValue());

        System.out.println();

        System.out.println(p2);
        System.out.println("Sell 15: " + p2.sell(15));
        System.out.println("Sell 4: " + p2.sell(4));

        System.out.println();

        System.out.println(p3);
        System.out.println("Inventory Value: " + p3.getInventoryValue());

        System.out.println();
        System.out.println("Total Products: " + Product.getProductCount());
    }
}
