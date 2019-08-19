package productTaxTest;

import org.junit.Test;
import productTax.ProductDetail;

import static junit.framework.TestCase.assertEquals;

public class ProductDetailTest {

    @Test public void itShouldGiveTheNameOfTheProduct(){
        String expected="Programming";
        ProductDetail productDetail=new ProductDetail(1,12,"book",false,"Programming");
        String actual=productDetail.name;
        assertEquals(expected,actual);
    }
    @Test public void itShouldGiveTheCategoryOfTheProduct(){
        String expected="Book";
        ProductDetail productDetail=new ProductDetail(1,12,"Book",false,"Programming");
        String actual=productDetail.category;
        assertEquals(expected,actual);
    }
}
