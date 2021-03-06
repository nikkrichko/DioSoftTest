import java.math.BigDecimal;

public class Goods {


    private final String name;



    protected final double price;

        protected int counter = 0;
        private int offerCount = 0;
        private double offerPrice = 0.0;
        private double different;

    public Goods(String name, double price, int count, double offerPrice) {
        this.name = name;
        this.price = price;
        this.offerCount = count;
        this.offerPrice = offerPrice;
        this.different = this.offerPrice - (price*this.offerCount);
    }

        public Goods(String name, double price) {
        this.name = name;
        this.price = price;
        }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public double getOfferPrice() {
        return offerPrice;
    }

    public void setCounter(int counter){
        if (counter == 0){
        this.counter = counter;
        } else {
        this.counter +=counter;
        }
    }

    public int getCounter() {
        return counter;
    }

    public int getOfferCount() {
        return offerCount;
    }

    public double getDifferent() {
        return different;
    }
}

