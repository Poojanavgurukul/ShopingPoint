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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                isImported == product.isImported &&
                Objects.equals(name, product.name)
                && Objects.equals(category,product.category);
    }

    @Override
    public String toString() {
        return name +" at "+ price;
    }
}
