package ex3;

public class Main {
    public static void main(String[] args) {
        User user = new User("Cloud", "Strife", "cstrife@shinra.com");
        Cart cart = new Cart(user);

        System.out.println("Date: " + user.getDate());
        System.out.println("Logged User: " + cart.getLoggedUser());
        System.out.println("Cart Total: " + cart.getTotal() + " gil");

        Item[] items = cart.getItemsList();
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println("Item ID: " + item.getItemId());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: " + item.getPrice() + " gil");
            System.out.println("Quantity: " + item.getQuantity());
        }
    }
}