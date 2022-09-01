import  java.util.*;
class Mythread1 extends Thread{
    private static int Start;
    @Override
    public void run() {
        for(int i=1;i<=Start;i++){
            System.out.println("Running thread of class MyThread1 :"+i);
            if(i%2==0){
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println("Exception occurred");
                }
            }
        }

    }
   public static void Stating(int a){
        Start=a;
    }
}

class MyThread2 implements Runnable{
    private static int Start;
    @Override
    public void run() {
        for(int i=1;i<=Start;i++) {
            System.out.println("Running thread of class MyThread2 :" + i);
            if (i % 2 != 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception occurred");
                }
            }
        }
    }
    public static void Stating(int a){
        Start=a;
    }
}

public class CreatingThreads {
    public static void main(String[] args) {
        System.out.println("Input the terminating point of threads :");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        Mythread1   mt1= new Mythread1();
        Mythread1.Stating(a);
        Thread   mt2= new Thread(new MyThread2());
        MyThread2.Stating(a);
        mt1.start();
        mt2.start();
        System.out.println("Main is Exiting....");
    }
}
