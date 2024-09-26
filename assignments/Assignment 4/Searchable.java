package exercises;

import java.util.LinkedList;

/* Next, write an interface Searchable that has the following methods:

Double getTotalByName(String name), which calculates the total price of shopping list items with the given name.

LinkedList<ShopItem> searchByName(String name), which returns a list of all the items in the shopping list with the given name. Note that you need to search for all the names that contain at least partially the given name. For example, if the parameter is fish, you need to return both the items Catfish and Goldfish.

LinkedList<ShopItem> searchSmaller(Double value), which returns a list of all the items in the shopping list, which price is less than the given value.

LinkedList<ShopItem> searchGreaterOrEqual(String name), which returns a list of all the items in the shopping list, which price is equal or greater than the given value. */
public interface Searchable {

    LinkedList<Product> searchByName(String name);

    LinkedList<Product> searchSmaller(Double price);

    LinkedList<Product> searchGreaterOrEqual(Double price);
}
