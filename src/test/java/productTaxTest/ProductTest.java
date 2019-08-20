package productTaxTest;

import org.junit.Test;
import productTax.Product;

import static org.junit.Assert.assertEquals;


public class ProductTest {

    @Test public void itShouldGiveTheNameOfTheProduct(){
        String expected="Programming";
        Product product =new Product(1,12,false,"Programming",false);
        String actual= product.name;
        assertEquals(expected,actual);
    }

    @Test public void itShouldGiveThePriceOfTheProduct(){
        double expected=12;
        Product product =new Product(1,12,false,"Java",false);
        double actual= product.price;
        assertEquals(expected,actual,1);
    }

    @Test public void itShouldGiveTheQuantityOfTheProduct(){
        int expected=2;
        Product product =new Product(2,12,false,"Java",false);
        int actual= product.quantity;
        assertEquals(expected,actual);
    }
    @Test public void itShouldGiveProductIsImported(){
        boolean epected=true;
        Product product =new Product(2,12,true,"kitkat",false);
        boolean actual= product.isImported;
        assertEquals(epected,actual);
    }
}
