package productTaxTest;

import org.junit.Test;
import productTax.SalesTax;

import static org.junit.Assert.assertEquals;

public class TaxTest {
    @Test public void itShouldGiveSalesTaxOnNonImportedProduct(){
        double expected=1.9;
        SalesTax salesTax=new SalesTax();
        double actual=salesTax.getTax(18,false,true,1);
        assertEquals(expected,actual,1);
    }
    @Test public void itShouldGiveSalesTaxOnImportedProduct(){
        double expected=7.15;
        SalesTax salesTax=new SalesTax();
        double actual=salesTax.getTax(47.50,true,true,1);
        assertEquals(expected,actual,1);
    }
}
