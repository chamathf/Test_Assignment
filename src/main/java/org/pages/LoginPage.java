package org.pages;

import org.openqa.selenium.By;


public class LoginPage {


    protected static By btnLogin = By.xpath("//button[@aria-label='Login']");
    protected static By txtEmail = By.xpath("//*[@id=\"input-email\"]");

    protected static By txtPassword = By.xpath("//input[@type='password']");

    protected static By clickContinueButton= By.xpath("//button[@data-h='button-element']");

    protected static By btnUser= By.xpath("//button[@aria-label='User']");

    protected static By titleUserName=  By.xpath("//span[text()='Welcome Back, ']");


}
