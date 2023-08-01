package org.test;

import org.assertj.core.api.SoftAssertions;
import org.common.Constants;
import org.function.ItemPurchasingFunction;
import org.function.ItemSearchFunction;
import org.function.LoginFunction;
import org.junit.jupiter.api.Test;

public class LoginAndPurchaseTest {

    // Test case: Purchase,Validate Item Purchasing Via Login To The Application

    @Test
    public void LoginPurchaseAndValidateTest() throws InterruptedException {

        SoftAssertions softAssertions = new SoftAssertions();
        System.setProperty("selenide.browser", Constants.BROWSER_NAME);
        LoginFunction.navigateToTheURL(Constants.APP_URL);
        LoginFunction.clickLoginButton();
        LoginFunction.enterEmail(Constants.EMAIL);
        LoginFunction.clickContinueButton();
        LoginFunction.enterPassword(Constants.PASSWORD);
        LoginFunction.clickContinueButton();
        LoginFunction.clickUserButton();
        String userProfileName = LoginFunction.getUserName();
        softAssertions.assertThat(userProfileName).isEqualTo(Constants.ACCOUNT_NAME);
        ItemSearchFunction.selectRingLink();
        ItemSearchFunction.selectRingCategory();
        ItemSearchFunction.selectSpecificRing();
        ItemPurchasingFunction.selectSize();
        ItemPurchasingFunction.clickAddToBagButton();
        String itemDescription = ItemPurchasingFunction.getItemDescription();
        softAssertions.assertThat(itemDescription).isEqualTo(Constants.DESCRIPTION_NAME);


        softAssertions.assertAll();

    }
}
