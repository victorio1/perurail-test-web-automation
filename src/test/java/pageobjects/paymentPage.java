package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paymentPage {

    WebDriver driver;

    public paymentPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[click='0']")
    private WebElement buttonPurchaseSummary;

    @FindBy(css = "#priceUSDrc")
    private WebElement labelTotalPrice;

    @FindBy(css = "div[class='contenido-compra'] div:nth-child(1) div:nth-child(2)")
    private WebElement labelTrainSelected;

    @FindBy(xpath = "//span[normalize-space()='USD 127.00']")
    private WebElement labelTotalPrice2;

    public void clickPurchaseSummary(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonPurchaseSummary));
        buttonPurchaseSummary.click();
    }

    public String getTotalPrice(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(labelTotalPrice));
        return labelTotalPrice.getText();
    }

    public String getTrainSelected(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(labelTrainSelected));
        return labelTrainSelected.getText();
    }

    public String getTotalPrice2(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(labelTotalPrice2));
        return labelTotalPrice2.getText().replaceAll("USD ","");
    }



}
