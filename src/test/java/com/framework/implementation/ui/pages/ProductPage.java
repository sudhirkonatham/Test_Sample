package com.framework.implementation.ui.pages;

import com.framework.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;


public class ProductPage extends TestBase {

    @FindBy(css = "div#addToCart_feature_div input")
    WebElement addToCartButton;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void getAddToCartButton() {
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
                executor.executeScript("arguments[0].click();", addToCartButton);
                driver.close();

            }
            driver.switchTo().window(parent);
        }
    }

}
