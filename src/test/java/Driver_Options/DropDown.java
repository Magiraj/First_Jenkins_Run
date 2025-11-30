package Driver_Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--headless=true");
        ChromeDriver driver=new ChromeDriver(option);
        driver.get("https://leafground.com/select.xhtml;jsessionid=node0syljnrlyyybr15owbm348h6xn9084292.node0");
       WebElement ele=driver.findElement(By.xpath("//button[contains(@class, 'ui-autocomplete-dropdown ui-button ui-widget ui-state-default')]"));
      ele.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      String[] dat={"ReactJs", "JMeter"};
      List<String> sel_options=new LinkedList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//span[contains(@id, 'j_idt87:auto-complete_panel')]/ul/li"));
        for(WebElement el:elements)
{
    System.out.println(el.getText());
    for (int i = 0; i < dat.length; i++) {

        String text=dat[i];
        if(text.equalsIgnoreCase(el.getText()))
        {
            el.click();
          sel_options.add(el.getText());
         //  System.out.println(el.getText()+" is Selected");
                }

    }

}
for(String str:sel_options)
{
    System.out.println("All selected options are: "+ str);
}
    }

}
