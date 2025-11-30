package paral;

import Driver_Options.DiverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Runa implements Runnable {
    @Override
    public  void run() {
        //driver.get("https://www.google.com/");

        WebDriver driver = DriverMan.getDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
      Runa s=  new Runa();
        Thread th=new Thread(s);
        Thread th1=new Thread(s);
        th.start();
        th1.start();;
        th.join();
        th1.join();
        System.out.println("Parallel exectuted successfully");

    }
}
