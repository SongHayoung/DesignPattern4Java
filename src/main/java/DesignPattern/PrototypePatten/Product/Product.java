package DesignPattern.PrototypePatten.Product;

public interface Product extends Cloneable{
    void getInfo();
    Product getClone();
}
