package DesignPattern.StrategyPattern;

public class BlackFridayPriceStrategy implements PriceStrategy{
    @Override
    public int pricePolicy(int price) {
        return (int) (price * 0.5);
    }
}
