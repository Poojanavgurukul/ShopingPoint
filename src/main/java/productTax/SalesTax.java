package productTax;

public class SalesTax {
    private int tax=10;
    private int extraTax=5;
    public double getTax(double amount,boolean imported,boolean isTaxApplicable,int quantity){
        double salesTax= tax*amount*quantity/100;
        if (isTaxApplicable){
            System.out.println(salesTax);
            if (imported){
                return salesTax+extraTax*amount/100;
            }
            else {
                return salesTax;
            }
        }
        return 0;
    }
}
