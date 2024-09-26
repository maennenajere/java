package exercises;

/*First, create a class Product that has the following:

private attributes Double price, Integer quantity, String name.

Constructor to create a shopItem and set the values (in the above order).

Getter for the attribute name.

Method public Double getTotal() which calculates the total price of the given quantity of items. */
public class Product {

    private Double price;
    private Integer quantity;
    private String name;

    public Product(Double price, Integer quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Double getTotal() {
        return price * quantity;
    }

    public Double getTotalPrice() {
        return getTotal();
    }

    @Override
    public String toString() {
        return "Product{"
                + "price=" + price
                + ", quantity=" + quantity
                + ", name='" + name + '\''
                + '}';
    }
}
