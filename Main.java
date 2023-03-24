public class Main {
    public static void main(String[] args) {

        GroceryList list = new GroceryList();
        list.add(new GroceryItemOrder("Apples", 0.5));
        list.add(new GroceryItemOrder("Bananas", 0.4));
        list.add(new GroceryItemOrder("Cookies", 2.3));
        list.add(new GroceryItemOrder("Milk", 1.0));
        System.out.println("Total cost: $" + list.getTotalCost());
    }
}