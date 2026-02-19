package com.mgaleano.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(css = "input[data-test='username']")
  private WebElement username;

  @FindBy(css = "input[data-test='password']")
  private WebElement password;

  @FindBy(css = "input[data-test='login-button']")
  private WebElement loginBtn;

  public LoginPage enterUsername(String username) {
    this.username.sendKeys(username);
    return new LoginPage(driver);
  }

  public LoginPage enterPassword(String password) {
    this.password.sendKeys(password);
    return new LoginPage(driver);
  }

  public ProductListingPage clickOnLogin() {
    this.loginBtn.click();
    return new ProductListingPage(driver);
  }

  public ProductListingPage loginUser(String username, String password) {
    enterUsername(username);
    enterPassword(password);
    return clickOnLogin();
  }
}
