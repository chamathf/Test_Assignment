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

       SoftAssertions softAssertions =new SoftAssertions();
       System.setProperty("selenide.browser",Constants.BROWSER_NAME);
       LoginFunction.navigateToTheURL(Constants.APP_URL);
       LoginFunction.clickLoginButton();
       LoginFunction.enterEmail(Constants.EMAIL);
       LoginFunction.clickContinueButton();
       LoginFunction.enterPassword(Constants.PASSWORD);
       LoginFunction.clickContinueButton();
       LoginFunction.clickUserButton();
       String userProfileName=LoginFunction.getUserName();
       softAssertions.assertThat(userProfileName).isEqualTo(Constants.ACCOUNT_NAME);
       ItemSearchFunction.selectRingLink();
       ItemSearchFunction.selectRingCategory();
       ItemSearchFunction.selectSpecificRing();
       ItemPurchasingFunction.selectSize();
       ItemPurchasingFunction.clickAddToBagButton();
       String itemDescription= ItemPurchasingFunction.getItemDescription();
       softAssertions.assertThat(itemDescription).isEqualTo(Constants.DESCRIPTION_NAME);



       softAssertions.assertAll();

   }


    //       Random random = new Random();
//       long randomNumbers = Math.abs(random.nextLong());
//       String email = randomNumbers + "vkc@gmail.com";
//       open("https://www.google.com");
//       $(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();
//       $(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
//       $(By.xpath("//span[contains(text(),'For my personal use')]")).click();
//       $(By.xpath("//input[@name='firstName']")).sendKeys("Test");
//       $(By.xpath("//input[@name='lastName']")).sendKeys("Test1");
//       $(By.xpath("//span[contains(text(),'Next')]")).click();
//       Thread.sleep(5000);
//       $(By.id("month")).selectOption(1);
//       $(By.id("day")).sendKeys("19");
//       $(By.id("year")).sendKeys("1994");
//       $(By.id("gender")).selectOption(1);;
//       $(By.xpath("//span[contains(text(),'Next')]")).click();


//       open("https://www.google.com");
//       $(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();
//       $(By.xpath("//input[@type='email']")).sendKeys("malaka7fernando@gmail.com");
//       Thread.sleep(3000);
//       $(By.xpath("//span[contains(text(),'Next')]")).click();
//       $(By.xpath("//input[@type='password']")).sendKeys("pallimulla");
//       $(By.xpath("//span[contains(text(),'Next')]")).click();
//       Thread.sleep(5000);


//
//       open("https://mejuri.com/world/en/");
//       WebDriverRunner.getWebDriver().manage().window().maximize();
//       Thread.sleep(5000);
//       String text= String.valueOf($(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div/div[1]/div[1]/div[1]")));
//       System.out.println(text);
    //      $(By.xpath("//*[@id=\"input-email\"]")).sendKeys("malaka7fernando@gmail.com");
    // $(By.xpath("//button[@data-h='button-element']")).click();

    //   Thread.sleep(6000);
    // $(By.xpath("//input[@type='password']")).sendKeys("Chamath@123");
    //    $(By.xpath("//button[@data-h='button-element']")).click();
    //    Thread.sleep(5000);
    //      $(By.xpath("//button[@aria-label='Search']")).click();
    //  Thread.sleep(6000);

    //      Thread.sleep(5000);

    //$(By.xpath("//input[@data-testid='main-search-input']")).sendKeys("Honey Mini Signet");
    // Thread.sleep(20000);

    //       $(By.xpath("//h6[text()='Honey Signet']")).click();
//       Thread.sleep(5000);
//       $(By.xpath("//span[text()='4']")).click();
    // $(By.xpath("//span[text()='Add to Bag']")).click();
}
