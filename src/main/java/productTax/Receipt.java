package productTax;


import java.util.Arrays;
import java.util.List;

public class Receipt {
    private final List<ProductDetail> receipt= Arrays.asList();
    private double totalAmount=0;
    public List<ProductDetail> addProduct(int quantity, double price, String category, boolean imported, String name){
        ProductDetail product = new ProductDetail(quantity,price,category,imported,name);
        receipt.add(product);
        totalAmount+=product.price;
        return receipt;
    }

    public double getTotalAmount(){
        return totalAmount;
    }
}
