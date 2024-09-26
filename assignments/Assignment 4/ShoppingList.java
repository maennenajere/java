package exercises;

import java.util.LinkedList;

/* Finally, create the class ShoppingList that implements the interface Searchable, and additionally has the following:
a linked list containing elements of object Product.
public method addItem(String name, Double price, Integer quantity).
Note that each item is considered separate entry, so do not add up new items to the existing items.
It is possible that for example the price is different when shopping is continued at later time. */
public class ShoppingList implements Searchable {

    private LinkedList<Product> products;

    public ShoppingList(String name, Double price, Integer quantity) {
        products = new LinkedList<>();
        addItem(name, price, quantity);
    }

    public void addItem(String name, Double price, Integer quantity) {
        Product product = new Product(price, quantity, name);
        products.add(product);
    }

    @Override
    public LinkedList<Product> searchByName(String name) {
        LinkedList<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public LinkedList<Product> searchSmaller(Double price) {
        LinkedList<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product.getTotalPrice() < price) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public LinkedList<Product> searchGreaterOrEqual(Double price) {
        LinkedList<Product> result = new LinkedList<>();
        for (Product product : products) {
            if (product.getTotalPrice() >= price) {
                result.add(product);
            }
        }
        return result;
    }

    public Double getTotalByName(String name) {
        Double total = 0.0;
        for (Product product : products) {
            if (product.getName().contains(name)) {
                total += product.getTotalPrice();
            }
        }
        return total;
    }
}
