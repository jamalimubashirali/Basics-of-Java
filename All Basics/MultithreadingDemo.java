public class MultithreadingDemo {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Class of thread is :"+t.getClass());
        System.out.println("Name of thread is :"+t.getName());
        System.out.println("Thread Priority is :"+t.getPriority());
        System.out.println("Thread group is :"+t.getThreadGroup());
        System.out.println("Is thread alive :"+t.isAlive());
        System.out.println("Is thread running in background :"+t.isDaemon());
        System.out.println("Is thread interrupted :"+t.isInterrupted());
        System.out.println("Count of thread activeness :"+t.activeCount());
    }
}
