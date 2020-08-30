package DesignPattern.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        Product normalProduct = new Product(new NormalPriceStrategy(), 10000);
        Product blackFridayProduct = new Product(new BlackFridayPriceStrategy(), 10000);
        Product timeSaleProduct = new Product(new TimeSalePriceStrategy(), 10000);

        System.out.println("normal product cost : " + normalProduct.getPrice());
        System.out.println("black friday product cost : " + blackFridayProduct.getPrice());
        System.out.println("time sale product cost : " + timeSaleProduct.getPrice());
    }
}
