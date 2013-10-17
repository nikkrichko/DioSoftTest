import org.junit.Test;

public class ScanetTest {


    @Test
    public void ScanerTest(){
        Goods A = new GoodsWithOffer("A", 1.25, 3, 3.00);
        Goods B = new Goods("B", 4.25);
        Goods C = new GoodsWithOffer("C", 1.00, 6, 5.00);
        Goods D = new Goods("D", 0.75);
        Scaner scaner = new Scaner();

        scaner.addGoodsToDB(A);
        scaner.addGoodsToDB(B);
        scaner.addGoodsToDB(C);
        scaner.addGoodsToDB(D);

        scaner.scan("A");
        scaner.scan("B");
        scaner.scan("C");
        scaner.scan("D");
//        scaner.scan("A");
//        scaner.scan("B");
//        scaner.scan("A");

//        scaner.scan("C");
//
//        scaner.scan("C");
//        scaner.scan("C");
//        scaner.scan("C");
//        scaner.scan("C");
//        scaner.scan("C");
//        scaner.scan("C");

        scaner.price();
        System.out.println("total price: " + scaner.price());
    }


    @Test
    public void ScanerTest_2(){
        Scaner scaner = new Scaner();
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
        System.out.println(scaner.price());

        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");
        scaner.scan("c");

        System.out.println(scaner.price());

        scaner.scan("a");
        scaner.scan("b");
        scaner.scan("c");
        scaner.scan("d");
        System.out.println(scaner.price());

    }
}
