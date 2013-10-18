import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class RequiredScanerTest {



    @Test
    public void ScanerTest_1(){
        PointOfSaleTerminal scaner = new PointOfSaleTerminal();
        BigDecimal expectedResult_1 = BigDecimal.valueOf(13.25);
        scaner.setPricing("a", 1.25, 3, 3.00);
        scaner.setPricing("b", 4.25);
        scaner.setPricing("c", 1.00, 6, 5.00);
        scaner.setPricing("d", 0.75);

        scaner.scan("a");
        scaner.scan("b");
        scaner.scan("c");
        scaner.scan("d");
        scaner.scan("a");
        scaner.scan("b");
        scaner.scan("a");

        Assert.assertEquals(expectedResult_1, scaner.price());



    }

    @Test
    public void ScanerTest_2(){
        PointOfSaleTerminal scaner = new PointOfSaleTerminal();
        BigDecimal expectedResult_2 = BigDecimal.valueOf(6.00);
        scaner.setPricing("a", 1.25, 3, 3.00);
        scaner.setPricing("b", 4.25);
        scaner.setPricing("c", 1.00, 6, 5.00);
        scaner.setPricing("d", 0.75);


        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        Assert.assertEquals(expectedResult_2, scaner.price());

    }

    @Test
    public void ScanerTest_3(){
        PointOfSaleTerminal scaner = new PointOfSaleTerminal();
        BigDecimal expectedResult_3 = BigDecimal.valueOf(7.25);
        scaner.setPricing("a", 1.25, 3, 3.00);
        scaner.setPricing("b", 4.25);
        scaner.setPricing("c", 1.00, 6, 5.00);
        scaner.setPricing("d", 0.75);

        scaner.scan("a");
        scaner.scan("b");
        scaner.scan("c");
        scaner.scan("d");
        Assert.assertEquals(expectedResult_3, scaner.price());

    }
//
//    @Test
//    public void ScanerTestExeption(){
//        PointOfSaleTerminal scaner = new PointOfSaleTerminal();
//        BigDecimal expectedResult_3 = BigDecimal.valueOf(7.25);
//        scaner.setPricing("a", 1.25, 3, 3.00);
//        scaner.setPricing("b", 4.25);
//        scaner.setPricing("c", 1.00, 6, 5.00);
//        scaner.setPricing("d", 0.75);
//
//        scaner.scan("a");
//        scaner.scan("a");
//        scaner.scan("a");
//        scaner.scan("s");
//        ScanerTestExeption();
//        System.out.println(scaner.price());
////        Assert.assertEquals(expectedResult_3, scaner.price());
//
//    }


}
