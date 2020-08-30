package DesignPattern.SingletonPattern.Singltons;

public class InitializationOnDemandHolderIdiomSingleton {
    private InitializationOnDemandHolderIdiomSingleton() {}

    private static class Holder{
        private static final InitializationOnDemandHolderIdiomSingleton instance = new InitializationOnDemandHolderIdiomSingleton();
    }

    public static InitializationOnDemandHolderIdiomSingleton getInstance() {
        return Holder.instance;
    }
}
