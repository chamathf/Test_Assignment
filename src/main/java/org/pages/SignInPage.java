package org.pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

public class SignInPage {

    protected static By txtName = By.xpath("//input[@name='name']");

    protected static By txtPassword = By.xpath("//input[@name='password']");

    protected static By checkbox = By.xpath("//input[@data-h='checkbox-element']/following-sibling::div[1]");

    protected static By btnSubmit = By.xpath("//button[@type='submit']");
}
