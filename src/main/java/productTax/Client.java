package productTax;
import java.text.DecimalFormat;

public class Client {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Receipt receipt=new Receipt();
        receipt.addProduct(1,12.49,false,"chips",false);
        receipt.addProduct(1,14.99,false,"cd",true);
        receipt.addProduct(1,0.85,false,"chocolate",false);
        for (Product product:receipt.getProducts()) {
            System.out.println(product);
            System.out.println("===================");
        }
        System.out.println( "total "+ df.format(receipt.getTotalAmount()));
        System.out.println("sales tax "+ df.format(receipt.getTotalTax()));
    }
}
