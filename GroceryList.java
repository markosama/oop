public class GroceryList {
    private GroceryItemOrder[] items;
    private int size;

    public GroceryList() {
        this.items = new GroceryItemOrder[10];
        this.size = 0;
    }

    public void add(GroceryItemOrder item) {
        if (size < 10) {
            items[size] = item;
            size++;
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }
}

