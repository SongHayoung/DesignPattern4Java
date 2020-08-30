package Core.Resource;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class CpuMonitor {
    OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

    public void run() {
        System.out.println("CPU Usage : " + String.format("%.2f", osBean.getSystemCpuLoad()));
    }
}
