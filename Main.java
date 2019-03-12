import Buttons.LoginPopUp;
import Buttons.WDriver;
import Buttons.WelcomePage;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public void setDriver () {
    }

    public static void main(String[] args) {

        }

        WelcomePage welcomePage = new WelcomePage();
        LoginPopUp loginPage = new LoginPopUp();

        String username = "kiiira";
        String password = "1mhungrY";

        welcomePage.clickEnterButton();
        loginPage.login(username, password);

}
