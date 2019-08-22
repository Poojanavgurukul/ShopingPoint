package productTaxTest;

import org.junit.Test;
import productTax.Product;

import static org.junit.Assert.assertEquals;


public class ProductTest {

    @Test public void itShouldGiveTheNameOfTheProduct(){
        String expected="Java";
        Product product =new Product("Java",12,"BOOK",false);
        String actual= product.name;
        assertEquals(expected,actual);
    }

    @Test public void itShouldGiveThePriceOfTheProduct(){
        double expected=12;
        Product product =new Product("Java",12,"BOOK",false);
        double actual= product.price;
        assertEquals(expected,actual,1);
    }

    @Test public void itShouldGiveProductIsImported(){
        boolean expected=true;
        Product product =new Product("Mobile",12,"electronic",true);
        boolean actual= product.isImported;
        assertEquals(expected,actual);
    }
}
