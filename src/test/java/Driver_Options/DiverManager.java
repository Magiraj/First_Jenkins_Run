package Driver_Options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiverManager {

    private static WebDriver driver;

    private DiverManager()
    {

    }

   public static WebDriver getDriver()
    {
        if(driver==null)
        {
            driver=new ChromeDriver();
        }
        return driver;
    }

    public static void quit()
    {
        if(driver!=null)
        {
driver.close();

        }
    }
}
