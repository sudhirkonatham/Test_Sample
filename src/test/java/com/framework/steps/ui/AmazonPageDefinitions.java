package com.framework.steps.ui;

import com.framework.base.TestBase;
import com.framework.implementation.ui.pages.LoginPage;
import com.framework.implementation.ui.pages.ProductPage;
import com.framework.implementation.utils.readJsonFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class AmazonPageDefinitions extends TestBase {

    LoginPage loginPage;
    ProductPage productPage;

    public AmazonPageDefinitions() {
        initialization();
        loginPage = new LoginPage();
        productPage = new ProductPage();
    }

    @Given("^user clicks amazon sign in logo$")
    public void clicksSignInLogo() {
        loginPage.getSignInLogo();
    }

    @And("^user enters username$")
    public void enterUsername() {
        loginPage.setUserName(readJsonFile.getJsonKeyValue("username"));
    }

    @And("^user clicks continue button$")
    public void clicksOnNextOnUsernamePage() {
        loginPage.getContinueButton();
    }

    @And("^user enters password$")
    public void enterPassword() {
        loginPage.setPassword(readJsonFile.getJsonKeyValue("password"));
    }

    @And("^user clicks sign in button$")
    public void clicksOnNextOnPasswordPage() {
        loginPage.getSignInButton();
    }

    @And("^user enters \"([^\"]*)\" test in search textbox$")
    public void enterProductName(String productName) {
        loginPage.sendTextInSearchTextbox(productName);
    }

    @And("^user clicks on search button$")
    public void clickSearchButton() {
        loginPage.getSearchButton();
    }

    @And("^user verifies list result contains \"([^\"]*)\"$")
    public void verifySearchResult(String productName) {
        loginPage.verifyList(productName);
    }

    @And("^user selects first product from list")
    public void selectFirstProductFromList() {
        loginPage.selectProductFromList();
    }
    @And("^user clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        productPage.getAddToCartButton();
    }

    @And("click on shopping cart")
    public void userClicksOnShoppingCart() {
        loginPage.getShoppingCart();
    }

    @And("^user clicks signout link$")
    public void clicksOnSignOutLink() {
        loginPage.getSignOutLink();
    }

}

