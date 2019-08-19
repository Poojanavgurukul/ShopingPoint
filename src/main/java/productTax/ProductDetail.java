package productTax;

public class ProductDetail {
    public int quantity;
    public double price;
    public String category;
    public boolean imported;
    public String name;

    public ProductDetail(int quantity, double price, String category,boolean imported,String name) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.imported =imported;
        this.name=name;
    }
}
