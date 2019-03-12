package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.transform.Source;
import java.util.concurrent.TimeUnit;


public class WDriver {

    ChromeDriver driver;
    WebDriverWait wait;

    public static WDriver wDriver;
    public static WDriver getInstance(){
        if (wDriver == null){
            wDriver = new WDriver();
        }
        return wDriver;
    }

    WDriver wd = new WDriver();

    private WDriver(){
        System.setProperty("webdriver.chromedriver.driver", "bin/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver, 3, 250);
        this.driver = driver;
    }


        public WebElement get (String xpath){
        WebElement element = null;
        for (int i = 0; i < 5; i++){
            try {
                System.out.println("Reaching xpath: " + xpath);
                element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                return element;
            }catch (StaleElementReferenceException e) {
                System.out.println("Stale element reference exception caught");
                continue;
            }
        }
        return element;
    }

    public void navigate(String url){
        System.out.println(String.format("Navigating to... '%s'", url));
        driver.get(url);
    }

    public void click(WebElement element){
        System.out.println("Clicking on element...");
        element.click();

    }
    public void sendKeys(WebElement element, String text){
        System.out.println("Sending keys...");
        element.sendKeys();
    }

    public void close() {
        System.out.println("Closing the page and exiting the driver...");
        driver.close();
        driver.quit();
        System.out.println("Driver succesfully shut down");
    }

}
