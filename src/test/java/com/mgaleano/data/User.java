package com.mgaleano.data;

import org.testng.annotations.DataProvider;

public class User {

  @DataProvider
  public static Object[][] standardUser() {
    return new Object[][]{{"standard_user", "secret_sauce"}};
  }
}
