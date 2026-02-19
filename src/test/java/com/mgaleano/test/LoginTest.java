package com.mgaleano.test;

import com.mgaleano.base.BaseTest;
import com.mgaleano.data.User;
import com.mgaleano.page.LoginPage;
import com.mgaleano.page.ProductListingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

  @Test(dataProvider = "standardUser", dataProviderClass = User.class)
  public void verifySuccessfulLogin(String username, String password) {

    LoginPage loginPage = new LoginPage(driver);
    ProductListingPage productListingPage = loginPage.loginUser(username, password);
    productListingPage = productListingPage.clickOnBurgerMenu();

    Assert.assertTrue(productListingPage.isLogoutButtonDisplayed(),
            "User doesn't seem to be logged in.");
  }
}
