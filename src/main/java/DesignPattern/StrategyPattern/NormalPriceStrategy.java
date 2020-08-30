package DesignPattern.StrategyPattern;

public class NormalPriceStrategy implements PriceStrategy{
    @Override
    public int pricePolicy(int price) {
        return price;
    }
}
