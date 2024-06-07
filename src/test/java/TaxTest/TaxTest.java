package TaxTest;

import br.cesul.Condominium.Condominium;
import br.cesul.Tax.Product;
import br.cesul.Tax.Service;
import br.cesul.Tax.ServiceCategory;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaxTest {
    @Test
    public void getFinalPriceCorrectProduct(){
        var product = new Product("Marcelo",200D,20D,10D,3);
        assertEquals(780D,product.getFinalPrice());
    }
    @Test
    public void getFinalPriceCorrectService(){
        var service = new Service("blowJob",89D, ServiceCategory.MASTER,30D,2D);
        assertEquals(254.54,service.getFinalPrice(),0.001);
    }
}
