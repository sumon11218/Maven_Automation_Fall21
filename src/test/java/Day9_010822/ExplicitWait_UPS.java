package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait_UPS {
    public static void main(String[] args) {

        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to usps
        driver.navigate().to("https://www.ups.com/us");
        //declaring explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);

        //click on Track
        Reusable_Actions.clickMethod(driver,"//*[text()='Tracking']","Track");

        //click on track a package
        Reusable_Actions.clickMethod(driver,"//*[text()='Track a Package']","Track a Package");

    }//end of test

}//end of class
