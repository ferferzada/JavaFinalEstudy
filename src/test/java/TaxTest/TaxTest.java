package TaxTest;

import br.cesul.tax.Product;
import br.cesul.tax.Service;
import br.cesul.tax.ServiceCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaxTest {
    @Test
    @DisplayName("MARSELÃO SENDO VENDIDO COM IMPOSTO CERTO")
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
