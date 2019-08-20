package productTax;

public class SalesTax {
    private int tax=10;
    private int extraTax=5;
    public double getTax(double amount,boolean imported){
        double salesTax= tax*amount;
        if (imported==true){
            salesTax=salesTax+extraTax*amount;
            return salesTax;
        }
        else {
            return salesTax;
        }
    }
}
