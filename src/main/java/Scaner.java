import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Scaner {

    private List<Goods> goodsDB = new ArrayList<Goods>();
    public List<Goods> priceDB = new ArrayList<Goods>();
    double totalPrice;

    public void setPricing(String name, double price){

        goodsDB.add(new Goods(name, price));
    }

    public void setPricing(String name, double price, int offerCount, double priceCount){

        goodsDB.add(new GoodsWithOffer(name, price,offerCount, priceCount));
    }

    public void addGoodsToDB(Goods goods) {
        goodsDB.add(goods);
    }

//    public void scan(String name) {
//        for (Goods good: goodsDB) {
//            if (good.getName().equals(name)) {
//                good.addItem();
//
//                break;
//            }
//        }
//    }

    public void scan (String name){
        for (Goods good: goodsDB){
            if (good.getName().equals(name)){
                priceDB.add(good);
                break;
            }

        }

    }

    public BigDecimal price() {
        BigDecimal total = new BigDecimal(0);
        totalPrice = 0;
        for (Goods goods: priceDB){
            if(goods.getOfferCount()!=0){
                goods.setCounter(1);
                if(goods.getCounter() == goods.getOfferCount()){
                    goods.setCounter(0);
                    totalPrice += goods.getDifferent();
                }
            }
            totalPrice += goods.price ;
//            System.out.println("current price : " + totalPrice);

        }
//        System.out.println("------");
//        for (Goods good : priceDB){
//// for (Goods good: goodsDB) {
//            total = total.add(good.getTotalPrice());
//
//
//        }

        priceDB.clear();
        return total = BigDecimal.valueOf(totalPrice);

        // clear goodsDB
    }

}