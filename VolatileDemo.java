public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!flag) { } 
            System.out.println("Thread detected flag = true");
        }).start();

        try { Thread.sleep(1000); } catch (Exception e) {}
        flag = true;
        System.out.println("Main thread set flag = true");
    }
}
