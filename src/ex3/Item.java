package ex3;

import java.util.Random;

public class Item {

    //attributes
    private int id;
    private String description;
    private int price;
    private int quantity;

    //constructor
    public Item() {
        Random random = new Random();
        this.id = random.nextInt(00000, 99999);
        this.description = "Item description goes here";
        this.price = random.nextInt(1, 500);
        this.quantity = random.nextInt(0, 99);
    }

}
