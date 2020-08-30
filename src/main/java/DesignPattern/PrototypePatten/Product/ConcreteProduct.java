package DesignPattern.PrototypePatten.Product;

public class ConcreteProduct implements Product{
    private String name;
    private int size;

    public ConcreteProduct(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void getInfo() {
       System.out.println("Name : " + this.name);
        System.out.println("Size : " + this.size);
    }

    @Override
    public Product getClone() {
        Product product = null;
        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        return product;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcreteProduct cloneObj = (ConcreteProduct)super.clone();
        //cloned object의 identify를 쉽게 확인하기 위해 Cloned prefix를 붙혔다
        cloneObj.name = "Cloned " + name;
        cloneObj.size = size;
        return cloneObj;
    }
}
