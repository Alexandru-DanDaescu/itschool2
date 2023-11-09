package session_31javaCoreRecap;

import java.util.ArrayList;
import java.util.List;

public class FormattedReceipt {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Item("apple",10, 2.5));
        items.add(new Item("milk",10, 1.99));
        items.add(new Item("bread",10, 2.49));

        String stringFormat = "%-15s | %5d | %10.2f%n";

        items.forEach(item -> System.out.printf(String.format(stringFormat, item.name, item.quantity, item.price)));
    }
}

class Item {
    String name;
    int quantity;
    double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}