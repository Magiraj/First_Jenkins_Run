package Driver_Options;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Single {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DiverManager.getDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(4000);
        DiverManager.quit();
    }

}
