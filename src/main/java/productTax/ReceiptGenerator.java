package productTax;

import java.util.HashMap;
import java.util.Map;

public class ReceiptGenerator {
    private Map<Product, Double> totalAmount = new HashMap<>();

    public Map<Product, Double> generate(TaxCalculator taxCalculator) {
        double total;
        for (Map.Entry<Product, Double> items : taxCalculator.getTax().entrySet()) {
            total = items.getKey().price +items.getValue();
            totalAmount.put(items.getKey(), total);
        }
        System.out.println(totalAmount);
        return totalAmount;
    }
}
