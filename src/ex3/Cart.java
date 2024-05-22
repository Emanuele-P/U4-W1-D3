package ex3;

public class Cart {

    //attributes
    private String loggedUser;
    private Item[] itemsList;
    private double total;

    private User user;

    //constructor
    public Cart(User user) {
        this.loggedUser = user.getName() + " " + user.getSurname();
        this.itemsList = new Item[5];
        String[] descriptions = {
                "Potion",
                "Hi-potion",
                "Phoenix-down",
                "Elixir",
                "Ether",
        };
        for (int i = 0; i < itemsList.length; i++) {
            itemsList[i] = new Item(descriptions[i]);
        }
        this.total = calculateTotal();
    }

    //methods
    private double calculateTotal() {
        double sum = 0;
        for (int i = 0; i < itemsList.length; i++) {
            Item item = itemsList[i];
            sum += item.getPrice() + item.getQuantity();
        }
        return sum;
    }

    //encapsulation

    public String getLoggedUser() {
        return loggedUser;
    }

    public Item[] getItemsList() {
        return itemsList;
    }

    public double getTotal() {
        return total;
    }
}
