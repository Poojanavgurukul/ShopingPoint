package productTax;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Product, Integer> cart = new HashMap<>();

    public void addProduct(Product product, Integer quantity) {
        cart.put(product, quantity);
    }

    public Map<Product, Integer> getProducts() {
        return cart;
    }
}
