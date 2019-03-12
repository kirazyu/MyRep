package Buttons;

import org.openqa.selenium.WebElement;

public class WelcomePage extends Instance{

    String mainPageLoginXpath = "//*[@id='js']";

    public void open () {

        driver.navigate("http://www.livejournal.com");
    }

    public void clickEnterButton () {
        WebElement enterButton = driver.get(mainPageLoginXpath);
        enterButton.click();
    }

}
