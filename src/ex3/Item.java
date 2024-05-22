package ex3;

import java.util.Random;

public class Item {

    //attributes
    private int itemId;
    private String description;
    private int price;
    private int quantity;

    //constructor
    public Item(String description) {
        Random random = new Random();
        this.itemId = random.nextInt(00000, 99999);
        this.description = description;
        this.price = random.nextInt(1, 500);
        this.quantity = random.nextInt(0, 99);
    }

    //encapsulation
    public int getItemId() {
        return itemId;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
