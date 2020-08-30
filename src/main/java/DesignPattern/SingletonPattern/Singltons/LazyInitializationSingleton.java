package DesignPattern.SingletonPattern.Singltons;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;
    private LazyInitializationSingleton() {
        System.out.println("LazyInitializationSingleton Constructor Called");
    }

    public static LazyInitializationSingleton getInstance() {
        if(instance == null)
            instance = new LazyInitializationSingleton();

        return instance;
    }
    public static void someStaticMethod() {
        System.out.println("Some Static Method Called");
    }
}
