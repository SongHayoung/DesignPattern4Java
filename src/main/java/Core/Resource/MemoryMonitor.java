package Core.Resource;

public class MemoryMonitor {
    int mb = 1024 * 1024;
    Runtime runtime = Runtime.getRuntime();

    public void run() {
        System.out.println("Used Memory : " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
        System.out.println("Free Memory : " + runtime.freeMemory() / mb);
        System.out.println("Total Memory : " + runtime.totalMemory() / mb);
        System.out.println("Used Memory : " + runtime.maxMemory() / mb);
    }
}
