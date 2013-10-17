public class GoodsWithOffer extends Goods {

    private final int offerCount;

    private final double offerPrice;

    private int addedItems;



    private double different;

    public GoodsWithOffer(String name, double price, int count, double offerPrice) {
        super(name, price);
        this.offerCount = count;
        this.offerPrice = offerPrice;
        this.different = this.offerPrice - (price*this.offerCount);
    }

    @Override
    public void addItem() {
        totalPrice += price;
        addedItems++;


        if (addedItems == offerCount) {
//              totalPrice = offerPrice;
//              addedItems = 0;

            totalPrice -= (offerCount * price);
            totalPrice += offerPrice;
            addedItems = 0;
        }
    }
    public int getOfferCount() {
        return offerCount;
    }

    public double getDifferent() {
        return different;
    }
}
//
//[22:34:39] Ковалевский вячеслав владимирович: у сканера будет лист товаров:
//        List<Goods> goods
//        и при добавлении товара надо просто пройтись по листу и спрашивать:
//        for (Goods good: goods) {
//        if (good.getName().equals(name)) {
//        good.addItem();
//break;
//}
//        }
