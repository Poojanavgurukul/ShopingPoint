package productTaxTest;

import org.junit.Test;
import productTax.SalesTax;

import static org.junit.Assert.assertEquals;

public class TaxTest {
    @Test public void itShouldGiveSalesTaxOnNonImportedProduct(){
        double expected=1.9;
        SalesTax salesTax=new SalesTax();
        double actual=salesTax.getTax(18,false);
        assertEquals(expected,actual,1);
    }
}
