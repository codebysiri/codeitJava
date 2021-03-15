package Ex0212;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public MarketGood (String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if (discountRate < 0 || discountRate > 100) {
            discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public MarketGood (String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        discountRate = 0;
    }

    public int getDiscountedPrice() {
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }


}
