package DesignPattern.SingletonPattern.Singltons;

public class EagerInitializationSingleton {
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();
    private EagerInitializationSingleton() {
        System.out.println("EagerInitializationSingleton Constructor Called");
    }

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
    public static void someStaticMethod() {
        System.out.println("Some Static Method Called");
    }
}
