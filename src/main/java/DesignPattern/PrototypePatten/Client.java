package DesignPattern.PrototypePatten;

import DesignPattern.PrototypePatten.Product.ConcreteProduct;
import DesignPattern.PrototypePatten.Product.Product;

public class Client {
    public static void main(String[] args) {
        Product product = new ConcreteProduct("Coke", 100);
        Product clonedProduct = product.getClone();
        product.getInfo();
        clonedProduct.getInfo();
    }
}