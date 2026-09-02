package constructors_keywords.assignment_problems;

public class Item {
    String itemName;
    int stock;

    Item(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    void restock(int stock) {
        this.stock += stock;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item("Keyboard", 15),
                new Item("Mouse", 40),
                new Item("Monitor", 8),
                new Item("Headset", 25)
        };

        for (Item item : items) {
            item.restock(20);
        }

        for (Item item : items) {
            System.out.println(
                    item.itemName + " - Final Stock: " + item.stock
            );
        }
    }
}