package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchPage {

    WebDriver driver;

    public searchPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#destinoSelect")
    private WebElement listDestination;

    @FindBy(css = "#rutaSelect")
    private WebElement listRoute;

    @FindBy(css = "#cbTrenSelect")
    private WebElement listTrain;

    @FindBy(css = ".cerrar-booking")
    private WebElement closeAlertBooking;

    @FindBy(css = "#salida")
    private WebElement dateDeparture;

    @FindBy(css = ".ui-datepicker-next.ui-corner-all")
    private WebElement buttonRightArrow;

    @FindBy(xpath = "//a[normalize-space()='25']")
    private WebElement button25Date;

    @FindBy(id = "btn_search")
    private WebElement buttonSearch;

    @FindBy(css = "#countParentsChildren")
    private WebElement buttonCountParents;

    @FindBy(css = "#adultsDism")
    private WebElement buttonDism;

    public void selectDestination(String destination){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listDestination));
        Select dropdown = new Select(listDestination);
        dropdown.selectByVisibleText(destination);
    }

    public void selectRoute(String route){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listRoute));
        Select dropdown = new Select(listRoute);
        dropdown.selectByVisibleText(route);
    }

    public void selectTrain(String train){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listTrain));
        Select dropdown = new Select(listTrain);
        dropdown.selectByVisibleText(train);
    }

    public void closeAlertBooking(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(closeAlertBooking));
        closeAlertBooking.click();
    }

    public void clickDateDeparture(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(dateDeparture));
        dateDeparture.click();
    }

    public void clickRightArrow(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonRightArrow));
        buttonRightArrow.click();
    }

    public void clickbutton25Date(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(button25Date));
        button25Date.click();
    }

    public void clickbuttonSearch(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonSearch));
        buttonSearch.click();
    }

    public void clickbuttonCountParents(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonCountParents));
        buttonCountParents.click();
    }

    public void clickbuttonDism(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonDism));
        buttonDism.click();
    }


}
