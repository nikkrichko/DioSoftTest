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

