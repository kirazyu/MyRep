package Buttons;

import org.openqa.selenium.WebElement;

public class LoginPopUp extends Instance{

        String usernameXpath = "//*[@id='user']";
        String passwordXpath = "//*[@id='lj_loginwidget_password']";
        String enterButtonXpath = "//*[@id='js']/body/div[2]/div[3]/div/div[2]/form[1]/button";

        public void login (String username, String password){
            WebElement loginField = driver.get(usernameXpath);
            loginField.sendKeys(username);
            WebElement passwordField = driver.get(passwordXpath);
            passwordField.sendKeys(password);
            WebElement loginButton = driver.get(enterButtonXpath);
            loginButton.click();

        }
    }

