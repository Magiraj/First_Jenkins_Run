package Driver_Options;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Browser_Example {

    public static void main(String[] args) {
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--start--maximized");
        ChromeDriver driver=new ChromeDriver(option);
        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Set<Cookie> cookies = driver.manage().getCookies();
        for(Cookie cook:cookies)
        {
            System.out.println(cook.getName()+" : "+cook.getValue());
                    }
String title="Google";
        Assert.assertEquals(driver.getTitle(), title);

if(title.equalsIgnoreCase(driver.getTitle()))
{
    System.out.println("Both are same : "+ driver.getTitle());
}
else
{
    System.out.println("Not match");
}

          }

}
