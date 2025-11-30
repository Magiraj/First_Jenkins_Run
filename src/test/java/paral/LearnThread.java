package paral;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnThread extends Thread{

    @Override
    public synchronized void run() {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        driver.close();
            }

    public static void main(String[] args) {
        LearnThread m=new LearnThread();
        Thread th=new Thread(m);
        Thread th1=new Thread(m);
        th.start();
        th1.start();


    }
}
