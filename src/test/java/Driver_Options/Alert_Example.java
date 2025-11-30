package Driver_Options;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alert_Example {
//accept,dismiss,getText(),sendKeys()
    public static void main(String[] args) {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/alert.xhtml");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
        driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert is present: " + alert.getText());
            alert.accept();
            System.out.println("Alert accepted using explicit wait");
        } catch (Exception e) {
            System.out.println("No alert appeared within 5 seconds (explicit wait)");
        }

        //StaleElementException
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath(""))));
    driver.close();
    }
}
