package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CellPhonePage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonePage.class.getName());

    public CellPhonePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneTitleLocator;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement ListViewIcon;

    public String actualPageTitleTextOfCellPhonePage() {
        log.info("Get page title text of cell phone page");
        return getTextFromElement(cellPhoneTitleLocator);
    }

    public void clickOnListViewIcon()  {
        log.info("click on list view icon" + ListViewIcon.toString());
        clickOnElement(ListViewIcon);

    }
    public void clickOnProductNokiaLumia1020() throws InterruptedException {
        Thread.sleep(2000);
        log.info("click on product nokia lumia 1020" );
        List<WebElement> mobileTitlesList = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        for (WebElement element : mobileTitlesList) {
            if (element.getText().contains("Nokia")) {
                element.click();
                break;
            }
        }
    }

}
