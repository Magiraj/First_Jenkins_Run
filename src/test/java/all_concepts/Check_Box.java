package all_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Check_Box {

    @Test
    public void checks() throws InterruptedException, MegaException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--headless=new");
        ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://leafground.com/checkbox.xhtml");
       // driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        Thread.sleep(4000);
     WebElement ele= driver.findElement(By.xpath("(//div[contains(@class, 'ui-chkbox-box ui-widget ui-corner')])[1]/span"));


        //Explicit
        try {
          //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
           // wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
            JavascriptExecutor js= (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", ele);
                    }

        catch(Exception e)
        {
            throw new MegaException("Element Not element click properly");
        }
        if (ele.isSelected())
        {
            System.out.println("Its Selected");
        }
    else {
            System.out.println("Not selected");
        }
    }

}
