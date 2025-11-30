package paral;

public class LearnRun extends ParentClass implements Runnable{
    @Override
    public void run() {

        sample();
    }

    public static void main(String[] args) throws InterruptedException {

        Thread th=new Thread(new LearnRun());
        Thread th1=new Thread(new LearnRun());
    th.start();
    th1.start();
    th.join();
    th1.join();
        System.out.println("All cases Executed");

    }
}
