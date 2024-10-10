package oamk.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public record Product(String name, Double price, String category, LocalDateTime bestBefore) implements OutputFormatter {

    @Override
    public String formatProduct(DateTimeFormatter dt) {
        // Format the output as [name,category,price,bestBefore] with US locale
        return String.format(Locale.US, "[%s,%s,%.2f,%s]", name, category, price, bestBefore.format(dt));
    }
}
