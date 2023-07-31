package org.function;

import org.common.Constants;
import org.pages.ItemPurchasingPage;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;


public class ItemPurchasingFunction extends ItemPurchasingPage {

    public static Logger logger = Logger.getLogger(ItemPurchasingFunction.class.getName());

    //This Method Use for Select the Size of the Ring
    public static void selectSize() throws InterruptedException {

        $(btnSize).click();
        Thread.sleep(20000);
        logger.info("Select the Size :- " + Constants.SIZE);
    }

    //This Method Use for Click Add To Bag Button
    public static void clickAddToBagButton() {

        $(btnAddToBag).click();
        logger.info("Click Add to Bag Button");

    }

    //This Method Use for get the ItemDescription
    public static String getItemDescription() {
        logger.info("Get The Item Description :- " + $(titleItemDescription).getText());
        String itemDescription = $(titleItemDescription).getText();
        return itemDescription;


    }

}
