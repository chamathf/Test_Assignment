package org.test;

import org.assertj.core.api.SoftAssertions;
import org.common.Constants;
import org.function.ItemPurchasingFunction;
import org.function.ItemSearchFunction;
import org.function.LoginFunction;
import org.function.SignInFunction;
import org.junit.jupiter.api.Test;


public class SignInAndPurchaseTest {

    // Test case: Purchase,Validate Item Purchasing Via SignIn To The Application

    @Test
    public void SignInPurchaseAndValidateTest() throws InterruptedException {


        SoftAssertions softAssertions =new SoftAssertions();
        System.setProperty("selenide.browser",Constants.BROWSER_NAME);
        LoginFunction.navigateToTheURL(Constants.APP_URL);
        LoginFunction.clickLoginButton();
        LoginFunction.enterEmail(Constants.EMAIL);
        LoginFunction.clickContinueButton();
        SignInFunction.enterName(Constants.USER_NAME);
        SignInFunction.enterPassword(Constants.PASSWORD);
        SignInFunction.selectCheckBox();
        SignInFunction.clickSubmitButton();
        LoginFunction.clickUserButton();
        String userProfileName=LoginFunction.getUserName();
        softAssertions.assertThat(userProfileName).isEqualTo(Constants.ACCOUNT_NAME);
        ItemSearchFunction.clickSearchButton();
        ItemSearchFunction.searchTheItem(Constants.Item_Name);
        ItemSearchFunction.selectTheItem();
        ItemPurchasingFunction.selectSize();
        ItemPurchasingFunction.clickAddToBagButton();
        String itemDescription= ItemPurchasingFunction.getItemDescription();
        softAssertions.assertThat(itemDescription).isEqualTo(Constants.DESCRIPTION_NAME);

        softAssertions.assertAll();
    }
}
