package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Product> cart;

    public Shop(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public Shop() {
    }

    public void addItem() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while(choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the name of the item: ");
            String name = sc.nextLine();

            System.out.print("Enter the unit price: ");
            double price = sc.nextDouble();

            System.out.print("Enter the quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            cart.add(product);

            System.out.print("Continue shopping (y/n)? ");
            sc.nextLine();
            choice = sc.nextLine();
        }
        printCart();
    }
    public void printCart() {
        double total = 0.0;
        for (Product product : cart) {
            double price = product.getPrice() * product.getQuantity();
            total += price;
            System.out.printf("%s $%.2f %d $%.2f%n",
                    product.getName(), product.getPrice(), product.getQuantity(), price);
        }
        System.out.println("Total $ Amount in Cart: $" + total);
    }
}
