package Driver_Options;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Frame_Example {

    public static void main(String[] args) {
ChromeOptions option=new ChromeOptions();
//option.addArguments("--headless=new");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://leafground.com/frame.xhtml");
        driver.manage().window().maximize();
      List<WebElement> ele= driver.findElements(By.tagName("iframe"));
        for (int i = 0; i < ele.size(); i++) {

            driver.switchTo().frame(i);
            if(i==2) {
                driver.switchTo().frame("frame2");
            }

            List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='Click Me']"));
            for (WebElement button : buttons) {
                button.click();
            }
driver.switchTo().defaultContent();

        }


        }
    }

