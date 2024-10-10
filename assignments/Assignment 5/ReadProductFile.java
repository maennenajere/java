package oamk.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class ReadProductFile {

    private File dataFile;
    private List<Product> products = new LinkedList<>();

    public ReadProductFile(String fileName) {
        dataFile = new File(fileName);
        if (!dataFile.exists()) {
            throw new IllegalArgumentException("File does not exist: " + fileName);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void readCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(dataFile))) {
            String line;
            int lineNumber = 0;
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] fields = line.split(",");

                try {
                    if (fields.length != 4) {
                        throw new CSVMissingParameterException("Error in " + dataFile.getName() + ", skipped line " + lineNumber + ": missing parameter");
                    }

                    for (String field : fields) {
                        if (field.trim().isEmpty()) {
                            throw new CSVMissingParameterException("Error in " + dataFile.getName() + ", skipped line " + lineNumber + ": missing parameter");
                        }
                    }

                    String name = fields[0];
                    Double price = Double.parseDouble(fields[1]);
                    String category = fields[2];
                    LocalDateTime bestBefore = LocalDateTime.parse(fields[3], formatter);

                    products.add(new Product(name, price, category, bestBefore));
                } catch (CSVMissingParameterException e) {
                    System.err.println(e.getMessage());
                    e.printStackTrace();
                } catch (Exception e) {

                    System.err.println("Error parsing line " + lineNumber + ": " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class CSVMissingParameterException extends Exception {

        public CSVMissingParameterException(String message) {
            super(message);
        }
    }
}
