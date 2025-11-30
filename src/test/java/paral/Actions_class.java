package paral;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.interactions.Actions;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class Actions_class {

    public static void main(String[] args) throws InterruptedException, IOException {
        int count=0;
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://leafground.com/window.xhtml;jsessionid=node0y4aqpaetdzhkn5goqkgarabl9277279.node0");
        driver.manage().window().maximize();
        Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        String parent = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();

        for(String str:allWindow)
        {
            System.out.println(count+" "+ str);
            count++;
        }
        System.out.println(parent);
        List<String> list=new ArrayList<>(allWindow);
        for (int i = 0; i < list.size(); i++) {
            WebDriver window = driver.switchTo().window(list.get(i));
            if (window.equals(parent))
            {
                continue;
            }
            try {
                WebElement weekBtn = driver.findElement(By.xpath("//button[text()='Week']"));
                weekBtn.click();
               // driver.close();   // Close child
            }
            catch (Exception e) {
                System.out.println("Week button not found");
            }

        }

    }
}
