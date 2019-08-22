package productTax;

import java.util.Objects;

public class Product {
    public double price;
    public boolean isImported;
    public String name;
    public String category;

    public Product(String name, double price, String category, boolean isImported) {
        this.price = price;
        this.isImported = isImported;
        this.name = name;
        this.category=category;
    }

    public String getCategory() {
        return category;
    }
}
