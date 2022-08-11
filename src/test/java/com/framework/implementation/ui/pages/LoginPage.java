package com.framework.implementation.ui.pages;

import com.framework.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends TestBase {
    private String productList ="h2.s-line-clamp-2 a span";
    @FindBy(css = "a#nav-link-accountList")
    WebElement amazonSignInLogo;
    @FindBy(css = "input#ap_email")
    WebElement userName;
    @FindBy(css = "input#continue")
    WebElement continueButton;
    @FindBy(css = "input#ap_password")
    WebElement password;
    @FindBy(css = "input#signInSubmit")
    WebElement signInButton;
    @FindBy(css = "a#nav-item-signout")
    WebElement signOutLink;
    @FindBy(css = "input#twotabsearchtextbox")
    WebElement searchTextbox;
    @FindBy(css = "input#nav-search-submit-button")
    WebElement searchButton;
    @FindBy(css = "h2.s-line-clamp-2 a span")
    List<WebElement> verifyList;
    @FindBy(css = " a#nav-cart")
    WebElement shoppingCart;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void getSignInLogo() {
        amazonSignInLogo.click();
    }
    public void setUserName(String amazonUsername) {
        userName.sendKeys(amazonUsername);
    }

    public void getContinueButton() {
        continueButton.click();
    }

    public void setPassword(String amazonPassword) {
        password.sendKeys(amazonPassword);
    }

    public void getSignInButton() {
        signInButton.click();
    }

    public void getSignOutLink() {
        Actions action = new Actions(driver);
        action.moveToElement(amazonSignInLogo);
        action.moveToElement(signOutLink).click().build().perform();
    }

    public void sendTextInSearchTextbox(String text) {
        searchTextbox.sendKeys(text);
    }

    public void getSearchButton() {
        searchButton.click();
    }

    public void verifyList(String text) {
        List<WebElement> webElementList = driver.findElements(By.cssSelector(productList));
        for (int i=0;i<webElementList.size();i++){
            Assert.assertTrue(webElementList.get(i).getText().contains(text));
        }
    }

    public void selectProductFromList() {
        verifyList.get(0).click();
    }

    public void getShoppingCart() {
        shoppingCart.click();
    }

}
