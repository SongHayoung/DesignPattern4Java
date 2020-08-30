package DesignPattern.SingletonPattern;

import DesignPattern.SingletonPattern.Singltons.EagerInitializationSingleton;
import DesignPattern.SingletonPattern.Singltons.LazyInitializationSingleton;

public class Client {
    public static void main(String[] args) {
        LazyInitializationSingleton.someStaticMethod();
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
    }
}
