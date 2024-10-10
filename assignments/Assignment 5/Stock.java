package oamk.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stock {

    private List<Product> products = new LinkedList<>();
    private LocalDateTime expireTime;
    private DateTimeFormatter stockFormat = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    // Getter for products list
    public List<Product> getProducts() {
        return products;
    }

    // Add product to the list
    public void addProduct(Product p) {
        products.add(p);
    }

    // toString method to output the stock
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of Products\n----------------\n");
        double totalPrice = 0;

        for (Product product : products) {
            sb.append(product.formatProduct(stockFormat)).append("\n");
            totalPrice += product.price();
        }

        // Use Locale.US for total price formatting to get a dot (.) as decimal separator
        sb.append(String.format(Locale.US, "-> Total products: %d\n", products.size()));
        sb.append(String.format(Locale.US, "-> Total price: %.2f\n", totalPrice));

        return sb.toString();
    }

    // Report products that have expired
    public List<Product> reportExpired(LocalDateTime dt) {
        return products.stream()
                .filter(expireFilter(dt))
                .collect(Collectors.toList());
    }

    // Predicate for filtering expired products
    private Predicate<Product> expireFilter(LocalDateTime dt) {
        return product -> product.bestBefore().isBefore(dt);
    }
}
