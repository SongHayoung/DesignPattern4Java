package DesignPattern.SingletonPattern.Singltons;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeDoubleLockingLazyInitializationSingleton {

    private static ThreadSafeDoubleLockingLazyInitializationSingleton instance;
    private static Lock lock = new ReentrantLock();
    private ThreadSafeDoubleLockingLazyInitializationSingleton() {
        System.out.println("ThreadSafeDoubleLockingLazyInitializationSingleton Constructor Called");
    }

    public static ThreadSafeDoubleLockingLazyInitializationSingleton getInstance() {
        lock.lock();
        if(instance == null){
            lock.lock();
            if(instance == null)
                instance = new ThreadSafeDoubleLockingLazyInitializationSingleton();
            lock.unlock();
        }

        return instance;
    }
}
