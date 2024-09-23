/* Modify the code so that when a Tv is created, the size of the Tv is initialized and the top class is also initialized. */

public class Product {

    private int price = 0;

    public Product(int p) {
        this.price = p;

    }

    public int getPrice() {
        return this.price;
    }
}

public class Tv extends Product {

    private int size = 0;

    public Tv(int price, int size) {
        super(price);
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

}
