package productTax;

import java.util.*;

public class TaxCalculator {
    private double taxRate = 0.1;
    private double importedTax = 0.05;
    private List<String> exemptCategory = Arrays.asList("BOOK", "MEDICAL", "FOOD");
    private final Map<Product, Double> productsWithTax = new HashMap<>();

    public void calculateTax(Cart cart) {
        double salesTax = 0;
        Map<Product, Integer> products = cart.getProducts();
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            double amount = product.getValue() * product.getKey().price;
            double tax = amount * taxRate;
            if (!exemptCategory.contains(product.getKey().category)) {
                if (product.getKey().isImported) {
                    salesTax = tax + importedTax * amount;
                } else {
                    salesTax = tax;
                }
            }
            productsWithTax.put(product.getKey(), salesTax);
        }
    }
    public  Map<Product, Double> getTax(){
        return productsWithTax;
    }
}
