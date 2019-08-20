package productTax;

import java.util.Objects;

public class Product {
    public int quantity;
    public double price;
    public boolean isImported;
    public String name;
    public boolean isTaxApplicable;

    public Product(int quantity, double price, boolean isImported, String name, boolean isTaxApplicable) {
        this.quantity = quantity;
        this.price = price;
        this.isImported = isImported;
        this.name = name;
        this.isTaxApplicable=isTaxApplicable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                Double.compare(product.price, price) == 0 &&
                isImported == product.isImported &&
                isTaxApplicable == product.isTaxApplicable &&
                Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return quantity+" "+ name +" at "+ price;
    }
}
