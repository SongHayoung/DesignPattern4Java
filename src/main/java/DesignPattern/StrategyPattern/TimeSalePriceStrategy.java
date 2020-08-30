package DesignPattern.StrategyPattern;

public class TimeSalePriceStrategy implements PriceStrategy{
    @Override
    public int pricePolicy(int price) {
        return (int) (price * 0.9);
    }
}
