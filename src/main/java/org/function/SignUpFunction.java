package org.function;


import org.pages.SignUpPage;


import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;


public class SignUpFunction extends SignUpPage {
    public static Logger logger = Logger.getLogger(SignUpFunction.class.getName());

    //This Method Use for Type the Name In SignIn Section
    public static void enterName(String name) throws InterruptedException {

        $(txtName).setValue(name);
        Thread.sleep(4000);
        logger.info("Type User Name :- " + name);
    }

    //This Method Use for Type the Password In SignIn Section
    public static void enterPassword(String password) throws InterruptedException {

        $(txtPassword).setValue(password);
        Thread.sleep(4000);
        logger.info("Type Password :- " + password);
    }

    //This Method Use for Select the CheckBox In SignIn Section
    public static void selectCheckBox() throws InterruptedException {

        $(checkbox).click();
        Thread.sleep(4000);
        logger.info("Selected The CheckBox");
    }

    //This Method Use for Click the Submit Button In SignIn Section
    public static void clickSubmitButton() throws InterruptedException {

        $(btnSubmit).click();
        Thread.sleep(10000);
        logger.info("Clicked Submit Button");
    }
}
