package productTax;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReceiptGenerator {
    double totalTax = 0;
    double totalCost = 0;
    private List<Map<String, String>> bill = new ArrayList<>();
    public DecimalFormat df = new DecimalFormat("0.00");


    public void generate(Map<Product, Double> productTaxMap, Cart cart) {
        Map<Product, Integer> items = cart.getProducts();
        for (Map.Entry<Product, Double> products : productTaxMap.entrySet()) {
            int quantity = items.get(products.getKey());
            double amount = products.getKey().price * quantity;
            bill.add(getItemDetails(products, quantity, amount));
            totalTax += products.getValue();
            totalCost += calculatePriceWithTax(products.getValue(), amount);
        }
    }

    public Map<String, String> getItemDetails(Map.Entry<Product, Double> product, int quantity, double price) {
        Product key = product.getKey();
        Map<String, String> receipt = new HashMap<>();
        receipt.put("price", String.valueOf(df.format(calculatePriceWithTax(product.getValue(), price))));
        receipt.put("quantity", String.valueOf(quantity));
        receipt.put("category", key.getCategory());
        return receipt;
    }

    public double calculatePriceWithTax(Double tax, double price) {
        return price + tax;
    }

    public void getPrintReceipt() {
        for (Map<String, String> aReceipt : this.bill) {
            for (Map.Entry<String, String> item : aReceipt.entrySet()) {
                System.out.print(item.getValue() + " ");
            }
            System.out.println("\n");
            System.out.println("=================");
        }
        System.out.println("Sales Tax - " + df.format(this.totalTax));
        System.out.println("Total - " + df.format(this.totalCost));
    }

}
