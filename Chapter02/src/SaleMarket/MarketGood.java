package SaleMarket;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String pName, int pRetailPrice, int pDiscountRate) {
        name = pName;
        retailPrice = pRetailPrice;
        if (pDiscountRate < 0 || pDiscountRate > 100) {
            discountRate = 0;
        } else {
            discountRate = pDiscountRate;
        }
    }

    public MarketGood(String pName, int pRetailPrice) {
        name = pName;
        retailPrice = pRetailPrice;
        discountRate = 0;
    }

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setDiscountRate(int newDiscountRate) {
        discountRate = newDiscountRate;
    }
    public int getDiscountRate() {
        return discountRate;
    }

    public int getDiscountedPrice() {
        return retailPrice - (retailPrice * discountRate)/100 ;
    }
}
