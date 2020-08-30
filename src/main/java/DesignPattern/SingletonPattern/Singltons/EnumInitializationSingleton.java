package DesignPattern.SingletonPattern.Singltons;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public enum EnumInitializationSingleton {
    INSTANCE;
    private final ConcurrentLinkedQueue<Integer> queue;

    private EnumInitializationSingleton() {
        queue = new ConcurrentLinkedQueue<>();
    }

    public void push(int val) {
        queue.add(val);
    }

    public int pop() {
        return queue.remove();
    }
}
