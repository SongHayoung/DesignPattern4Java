package Core.Resource;


import java.util.Timer;
import java.util.TimerTask;

public class ResourceManager {
    TimeMonitor timeMonitor;
    CpuMonitor cpuMonitor;
    MemoryMonitor memoryMonitor;
    Timer timer;
    TimerTask timerTask;
    long start;

    private ResourceManager(Builder builder) {
        this.timeMonitor = builder.timeMonitor;
        this.cpuMonitor = builder.cpuMonitor;
        this.memoryMonitor = builder.memoryMonitor;
        this.timer = builder.timer;
        this.timerTask = builder.timerTask;
    }

    public static class Builder {
        private TimeMonitor timeMonitor = null;
        private CpuMonitor cpuMonitor = null;
        private MemoryMonitor memoryMonitor = null;
        private Timer timer = null;
        private TimerTask timerTask = null;

        public Builder() {
            this.timer = new Timer();
            this.timerTask = new TimerTask() {
                @Override
                public void run() {
                    if(timeMonitor != null)
                        timeMonitor.run();
                    if(cpuMonitor != null)
                        cpuMonitor.run();
                    if(memoryMonitor != null)
                        memoryMonitor.run();
                    System.out.println("====================");
                }
            };
        }

        public Builder TimeMonitor(TimeMonitor timeMonitor) {
            this.timeMonitor = timeMonitor;
            return this;
        }

        public Builder MemoryMonitor(MemoryMonitor memoryMonitor) {
            this.memoryMonitor = memoryMonitor;
            return this;
        }

        public Builder CpuMonitor(CpuMonitor cpuMonitor) {
            this.cpuMonitor = cpuMonitor;
            return this;
        }

        public ResourceManager build() {
            return new ResourceManager(this);
        }
    }

    public void run() {
        start = System.currentTimeMillis();
        timer.schedule(timerTask, 0, 1000);
    }

    public void cancel() {
        timer.cancel();
        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end - start)/1000.0);
    }
}
