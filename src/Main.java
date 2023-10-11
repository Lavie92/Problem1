import entities.Product;
import entities.Shop;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
        Shop shop = new Shop(cart);
        shop.addItem();
    }
}