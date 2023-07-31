package org.pages;


import org.common.Constants;
import org.openqa.selenium.By;

public class ItemSearchPage {



    protected static By btnSearch = By.xpath("//button[@aria-label='Search']");
    protected static By txtFldSearch = By.xpath("//input[@data-testid='main-search-input']");

    protected static By cardItem = By.xpath("//h6[text()='Honey Signet']");

    protected static By linkRing = By.xpath("(//a[@data-h='anchor-']//div)[2]");

    protected static By categoryRing = By.xpath("//a/span[text()='"+ Constants.Ring_Category+"']");

    protected static By lblRingName = By.xpath("//span[text()='"+ Constants.Item_Name+"']");


   }
