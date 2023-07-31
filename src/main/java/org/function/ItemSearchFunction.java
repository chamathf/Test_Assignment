package org.function;

import org.common.Constants;
import org.pages.ItemSearchPage;


import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;


public class ItemSearchFunction extends ItemSearchPage {

    public static Logger logger = Logger.getLogger(ItemSearchFunction.class.getName());

    //This Method Use for Click the Search Button
    public static void clickSearchButton() throws InterruptedException {

        $(btnSearch).click();
        Thread.sleep(5000);
        logger.info("Clicked Search Button");
    }

    //This Method Use for Type and Search the Item
    public static void searchTheItem(String item) throws InterruptedException {

        $(txtFldSearch).setValue(item);
        Thread.sleep(21000);
        logger.info("Searched the Item :- " + item);
    }

    //This Method Use for Select the Item
    public static void selectTheItem() throws InterruptedException {

        $(cardItem).click();
        Thread.sleep(10000);
        logger.info("Select the Item :- " + Constants.Item_Name);
    }

    //This Method Use for Select the Ring Link
    public static void selectRingLink() throws InterruptedException {
        Thread.sleep(4000);
        $(linkRing).click();
        Thread.sleep(10000);
        logger.info("Clicked the Ring Link ");

    }

    //This Method Use for Select the Ring Category
    public static void selectRingCategory() throws InterruptedException {
        $(categoryRing).click();
        Thread.sleep(12000);
        logger.info("Selected the Ring Category :- " + Constants.Ring_Category);

    }

    //This Method Use for Select the Specific Ring
    public static void selectSpecificRing() throws InterruptedException {
        $(lblRingName).click();
        Thread.sleep(12000);
        logger.info("Selected the Ring  :- " + Constants.Item_Name);

    }
}

