package Core.Resource;

public class TimeMonitor {
    int time = 0;

    public void run() {
        System.out.println("over " + time++ + " sec");
    }
}
