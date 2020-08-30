package DesignPattern.StrategyPattern;

public class Product {
    private PriceStrategy priceStrategy;
    private int price;

    public Product(PriceStrategy priceStrategy, int price) {
        this.priceStrategy = priceStrategy;
        this.price = price;
    }

    public int getPrice() {
        return priceStrategy.pricePolicy(price);
    }
}
