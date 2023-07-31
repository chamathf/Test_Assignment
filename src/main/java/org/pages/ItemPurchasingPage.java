package org.pages;

import org.common.Constants;
import org.openqa.selenium.By;

public class ItemPurchasingPage {

    protected static By btnSize = By.xpath("//span[text()='"+ Constants.SIZE +"']");

    protected static By btnAddToBag = By.xpath("//span[text()='Add to Bag']");

    protected static By titleItemDescription =   By.xpath("//p[text()='Size: "+Constants.SIZE+", Gold Vermeil']");


}
