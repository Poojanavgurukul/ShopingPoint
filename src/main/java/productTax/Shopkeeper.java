package productTax;

public class Shopkeeper {
    public void shopkeeper(Integer quantity, double price, String category, String name, boolean isImported) {
        Product product = new Product("Java", 10, "cd", false);
        Product product1=new Product("choco",20,"FOOD",false);
        Cart cart = new Cart();
        cart.addProduct(product, quantity);
        cart.addProduct(product1,quantity);

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTax(cart);

        ReceiptGenerator receiptGenerator=new ReceiptGenerator();
        receiptGenerator.generate(taxCalculator);
    }
}
