package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class choosePage {

    WebDriver driver;

    public choosePage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "select[name='selectRooms[suite]']")
    private WebElement listNumberofSuiteCabins;

    @FindBy(css = "#continuar_bae")
    private WebElement buttonContinueChooseCabin;

    @FindBy(id = "div_2021021641_12")
    private WebElement buttonExpedition33;

    @FindBy(id = "div_2021021886_13")
    private WebElement buttonExpedition34;

    @FindBy(css = "input[value='Continue']")
    private WebElement buttonContinuetoPassenger;


    public void selectDestination(String cabin){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listNumberofSuiteCabins));
        Select dropdown = new Select(listNumberofSuiteCabins);
        dropdown.selectByVisibleText(cabin);
    }

    public void clickContinueChooseCabin(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonContinueChooseCabin));
        buttonContinueChooseCabin.click();
    }

    public void clickExpedition33(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonExpedition33));
        buttonExpedition33.click();
    }

    public void clickExpedition34(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonExpedition34));
        buttonExpedition34.click();
    }

    public void clickContinuetoPassenger(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonContinuetoPassenger));
        buttonContinuetoPassenger.click();
    }

}
