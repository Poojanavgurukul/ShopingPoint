package productTax;

public class SalesTax {
    private int tax=10;
    private int extraTax=5;
    public double getTax(double amount,boolean imported){
        double salesTax= tax*amount/100;
        if (imported==true){
            double extraSalesTax=salesTax+extraTax*amount/100;
            return extraSalesTax;
        }
        else {
            return salesTax;
        }
    }
}
