package productTaxTest;

import org.junit.Test;
import productTax.Amount;

import static org.junit.Assert.assertEquals;

public class AmountTest {
    @Test public void itShouldGiveTheAmountPerQuantity(){
        double expected=20;
        Amount amount=new Amount();
        double atcual=amount.getAmount(2,10);
        assertEquals(expected,atcual,1);
    }
}
