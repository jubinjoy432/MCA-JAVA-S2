class PriorityThread extends Thread {
    private String threadName;

    public PriorityThread(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Priority: " + getPriority() + " - Count: " + i);
        }
    }
    
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String name) {
        this.threadName = name;
    }
}

public class Program34 {
    public static void main(String[] args) {
        PriorityThread highPriorityThread = new PriorityThread("High Priority Thread");
        PriorityThread lowPriorityThread = new PriorityThread("Low Priority Thread");
        PriorityThread normalPriorityThread = new PriorityThread("Normal Priority Thread");

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
        normalPriorityThread.start();
    }
}
