package DesignPattern.SingletonPattern.Singltons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeLazyInitializationSingleton {
    private static ThreadSafeLazyInitializationSingleton instance;
    private static Lock lock = new ReentrantLock();
    private ThreadSafeLazyInitializationSingleton() {
        System.out.println("ThreadSafeLazyInitializationSingleton Constructor Called");
    }

    public static ThreadSafeLazyInitializationSingleton getInstance() {
        lock.lock();
        if(instance == null)
            instance = new ThreadSafeLazyInitializationSingleton();
        lock.unlock();

        return instance;
    }
}
