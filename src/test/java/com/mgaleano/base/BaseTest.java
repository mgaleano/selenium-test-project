package com.mgaleano.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

  protected WebDriver driver;

  @BeforeTest
  public void setupDriver() {
    driver = new ChromeDriver();
  }

  @BeforeMethod
  public void openApp() {
    driver.get("https://www.saucedemo.com/");
  }

  @AfterTest
  public void afterMethod() {
    driver.quit();
  }
}