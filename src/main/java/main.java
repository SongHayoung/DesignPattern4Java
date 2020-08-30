import Core.Resource.CpuMonitor;
import Core.Resource.MemoryMonitor;
import Core.Resource.ResourceManager;
import Core.Resource.TimeMonitor;

public class main {
    static ResourceManager resourceManager = new ResourceManager.Builder().TimeMonitor(new TimeMonitor())
            .CpuMonitor(new CpuMonitor()).MemoryMonitor(new MemoryMonitor()).build();

    private static int i;
    public static void main(String[] args) {
        resourceManager.run();
        for(int j = 0; j < Integer.MAX_VALUE; j++)
        for(int i = 0; i < Integer.MAX_VALUE; i++)
            func1();
        resourceManager.cancel();

    }

    public static int func1() {
        if(i == 0)
            return i;
        return 0;
    }

    public static int func2() {
        int res = i;
        if(res == 0)
            return res;
        return 0;
    }
}
