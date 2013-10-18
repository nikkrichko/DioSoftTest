import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class PointOfSaleTerminalTest {
    @Test
    public void testSetPricing() throws Exception {
        PointOfSaleTerminal scan = new PointOfSaleTerminal();
        scan.setPricing("a", 5.00);
        Goods expectedResult = new Goods("a", 5.00);
        assertTrue(expectedResult.getName().equals(scan.goodsDB.get(0).getName()));
        assertEquals(expectedResult.getPrice(), scan.goodsDB.get(0).getPrice());
    }



    @Test
    public void testSetPricingWithOffer() throws Exception {
        PointOfSaleTerminal scan = new PointOfSaleTerminal();
        scan.setPricing("a", 5.00, 4, 20.00);
        Goods expectedResult = new Goods("a", 5.00, 4, 20.00);
        assertTrue(expectedResult.getName().equals(scan.goodsDB.get(0).getName()));
        assertEquals(expectedResult.getPrice(), scan.goodsDB.get(0).getPrice());
        assertEquals(expectedResult.getOfferPrice(), scan.goodsDB.get(0).getOfferPrice());
        assertEquals(expectedResult.getOfferCount(), scan.goodsDB.get(0).getOfferCount());


    }

    @Test
    public void testScan() throws Exception {
        PointOfSaleTerminal scan = new PointOfSaleTerminal();
        scan.setPricing("a", 5.00, 4, 20.00);
        Goods expectedResult = new Goods("a", 5.00, 4, 20.00);
        scan.scan("a");
        assertTrue(expectedResult.getName().equals(scan.priceDB.get(0).getName()));
        assertEquals(expectedResult.getPrice(), scan.priceDB.get(0).getPrice());
        assertEquals(expectedResult.getOfferPrice(), scan.priceDB.get(0).getOfferPrice());
        assertEquals(expectedResult.getOfferCount(), scan.priceDB.get(0).getOfferCount());
    }

    @Test
    public void testPriceWithOutOffer() throws Exception {
        PointOfSaleTerminal scan = new PointOfSaleTerminal();
        scan.setPricing("a", 5.00, 4, 20.00);
        BigDecimal expectedResult = BigDecimal.valueOf(15.00);
        scan.scan("a");
        scan.scan("a");
        scan.scan("a");
        assertEquals(expectedResult, scan.price());

    }
    @Test
    public void testPriceWithOffer() throws Exception {
        PointOfSaleTerminal scan = new PointOfSaleTerminal();
        scan.setPricing("a", 5.00, 4, 20.00);
        BigDecimal expectedResult = BigDecimal.valueOf(20.00);
        scan.scan("a");
        scan.scan("a");
        scan.scan("a");
        scan.scan("a");
        assertEquals(expectedResult, scan.price());

    }


}
