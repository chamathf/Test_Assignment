package org.function;


import com.codeborne.selenide.WebDriverRunner;

import org.pages.LoginPage;


import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginFunction extends LoginPage {

    public static Logger logger = Logger.getLogger(LoginFunction.class.getName());

    //This Method Use for Click the Login Button
    public static void clickLoginButton() throws InterruptedException {

        $(btnLogin).click();
        Thread.sleep(9000);
        logger.info("Clicked Login Button");
    }

    //This Method Use for Navigate to the Application
    public static void navigateToTheURL(String url) throws InterruptedException {

        open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Thread.sleep(10000);
        logger.info("Navigate To The URL :- " + url);

    }

    //This Method Use for Type the Email
    public static void enterEmail(String email) throws InterruptedException {

        $(txtEmail).setValue(email);
        ;
        Thread.sleep(8000);
        logger.info("Type Email :- " + email);
    }

    //This Method Use for Type the Password
    public static void enterPassword(String password) throws InterruptedException {

        $(txtPassword).setValue(password);
        ;
        Thread.sleep(9000);
        logger.info("Type Password");
    }

    //This Method Use for Click the Continue Button
    public static void clickContinueButton() throws InterruptedException {

        $(clickContinueButton).click();
        ;
        Thread.sleep(6000);
        logger.info("Clicked Continue Button");
    }

    //This Method Use for Click User Button
    public static void clickUserButton() throws InterruptedException {

        $(btnUser).click();
        logger.info("Click User Button");
        Thread.sleep(12000);
    }


    //This Method Use for get User_Name
    public static String getUserName() {
        logger.info("Get The User Name In Account :- " + $(titleUserName).getText());
        String userProfileName = $(titleUserName).getText();
        return userProfileName;

    }

}
