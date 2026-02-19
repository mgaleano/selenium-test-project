package com.mgaleano.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {

  WebDriver driver;

  public ProductListingPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(css = "input[data-test='title']")
  private WebElement productsTitle;

  @FindBy(id = "react-burger-menu-btn")
  private WebElement burgerMenuBtn;

  @FindBy(css = "a[data-test='logout-sidebar-link']")
  private WebElement logoutBtn;

  public boolean isProductTitleDisplayed() {
    return productsTitle.isDisplayed();
  }

  public ProductListingPage clickOnBurgerMenu() {
    burgerMenuBtn.click();
    return new ProductListingPage(driver);
  }

  public boolean isLogoutButtonDisplayed() {
    return logoutBtn.isDisplayed();
  }
}
