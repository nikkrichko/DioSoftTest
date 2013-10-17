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


    public void scan (String name){
        try{
        for (Goods good: goodsDB){
            if (good.getName().equals(name)){
                priceDB.add(good);
                break;
            }  else
            {
                throw new NoSuchFieldException();
            }

        }
        } catch (NoSuchFieldException e){
            System.out.println("item:" + name);
            System.out.println("there is no such goods in DB");
        }

    }

    public BigDecimal price() {
        BigDecimal total = new BigDecimal(0);
        totalPrice = 0;
        for (Goods goods: priceDB){
            countCheck(goods);


            totalPrice += goods.price ;
        }
        priceDB.clear();
        return total = BigDecimal.valueOf(totalPrice);


    }

    private void countCheck(Goods goods){
        if(goods.getOfferCount()!=0){
            goods.setCounter(1);
            if(goods.getCounter() == goods.getOfferCount()){
                goods.setCounter(0);
                totalPrice += goods.getDifferent();
            }
        }
    }
}