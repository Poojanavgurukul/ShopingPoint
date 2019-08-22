package productTax;

import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Product product = new Product("Java", 12.49, "BOOK", false);
        Product product1 =new Product("arjeet",14.99,"Music CD",false);
        Product product2 = new Product("chocolate Bar", 0.85, "FOOD", false);
        Cart cart = new Cart();
        cart.addProduct(product,1);
        cart.addProduct(product1,1 );
        cart.addProduct(product2,1);

        TaxCalculator taxCalculator = new TaxCalculator();
        Map<Product, Double> productTaxMap = taxCalculator.calculateTax(cart);

        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        receiptGenerator.generate(productTaxMap,cart);
        receiptGenerator.receiptPrinter();
    }
}
