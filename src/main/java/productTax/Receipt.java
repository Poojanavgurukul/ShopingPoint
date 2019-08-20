package productTax;


import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final List<Product> bills= new ArrayList<>();
    private double totalAmount = 0;
    private double totalTax=0;
    SalesTax salesTax=new SalesTax();
    public Receipt addProduct(int quantity, double price, boolean isImported, String name,boolean isTaxApplicable){
        Product product = new Product(quantity,price+salesTax.getTax(price,isImported,isTaxApplicable,quantity),isImported,name,isTaxApplicable);
        bills.add(product);
        totalTax+=salesTax.getTax(product.price,product.isImported,product.isTaxApplicable,product.quantity);
        totalAmount+=product.price*product.quantity;
        return this;
    }
    public List<Product> getProducts() {
        return bills;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public double getTotalTax(){
        return totalTax;
    }

}
