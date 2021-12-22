package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.choosePage;
import pageobjects.passengerPage;
import pageobjects.paymentPage;
import pageobjects.searchPage;

import java.lang.reflect.MalformedParameterizedTypeException;

public class bookingTravelSteps {

    private WebDriver driver;

    @Before
    public void setUp() throws MalformedParameterizedTypeException{
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I get in the Peru Rail webPage$")
    public void openPage(){
        driver.manage().window().maximize();
        driver.get("https://www.perurail.com/");
    }

    @And("^I select my \"([^\"]*)\" and the \"([^\"]*)\"$")
    public void iSelectMyDestinationAndRoute(String destination, String route){
        searchPage searchElements = new searchPage(driver);
        searchElements.selectDestination(destination);
        searchElements.selectRoute(route);
    }

    @And("^Besides, I select the \"([^\"]*)\"$")
    public void iSelectMyDestinationAndRoute(String train){
        searchPage searchElements = new searchPage(driver);
        searchElements.selectTrain(train);
        searchElements.closeAlertBooking();
    }

    @And("^I select the date to 25 May 2022$")
    public void iSelectDateToDate(){
        searchPage searchElements = new searchPage(driver);
        searchElements.clickDateDeparture();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickbutton25Date();
        searchElements.clickbuttonSearch();
    }

    @And("^I select to date to 25 May 2022$")
    public void iSelectToDateToDate(){
        searchPage searchElements = new searchPage(driver);
        searchElements.clickDateDeparture();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickRightArrow();
        searchElements.clickbutton25Date();
    }

    @And("^I select only 1 person for the travel$")
    public void iSelectOnly1PersonforTravel(){
        searchPage searchElements = new searchPage(driver);
        searchElements.clickbuttonCountParents();
        searchElements.clickbuttonDism();
        searchElements.clickbuttonSearch();
    }

    @When("^I select \"([^\"]*)\" to Suite Cabins Section$")
    public void iSelectCabintoSuiteCabinSection(String cabin){
        choosePage chooseElements = new choosePage(driver);
        chooseElements.selectDestination(cabin);
    }

    @When("^I select the departure of round trip$")
    public void iSelectDepartureOfRoundTrip(){
        choosePage chooseElements = new choosePage(driver);
        chooseElements.clickExpedition33();
        chooseElements.clickExpedition34();
        chooseElements.clickContinuetoPassenger();
    }

    @And("^I'm going to continue to click the button Continue$")
    public void iContinuetoClickinContinue(){
        choosePage chooseElements = new choosePage(driver);
        chooseElements.clickContinueChooseCabin();

    }

    @And("^I complete all the information about the passenger$")
    public void iCompleteAllTheInformationAboutThePassenger() throws Exception{
        passengerPage passengerElements = new passengerPage(driver);
        passengerElements.writeFirstName("Eduardo");
        passengerElements.writeLastName("Victorio");
        passengerElements.clickCalendarDateofBirth();
        passengerElements.selectMonth("Mar");
        passengerElements.selectYear("1997");
        passengerElements.clickDayOption22();
        passengerElements.selectNationality("Peru");
        passengerElements.selectKindOfDocument("Identification Card");
        passengerElements.writeDocumentNumber("71914163");
        passengerElements.selectSex("Male");
        passengerElements.writeTelephone("902292248");
        passengerElements.writeEmail("evictorio.uni@gmail.com");
        passengerElements.writeConfirmEmail("evictorio.uni@gmail.com");
        passengerElements.clickContinueToPayment();
        Thread.sleep(5000);
    }

    @And("^I complete all the information of the passenger$")
    public void iCompleteAllTheInformationOfThePassenger(){
        passengerPage passengerElements = new passengerPage(driver);
        passengerElements.writeNames("Eduardo");
        passengerElements.writeSurname("Victorio");
        passengerElements.clickDateofBirth();
        passengerElements.selectMonthBirth("MARCH");
        passengerElements.selectYearBirth("1997");
        passengerElements.clickDayOption22();
        passengerElements.selectNationality2("Peru");
        passengerElements.selectKindOfDocument2("Identification Card");
        passengerElements.writeDocument2("71914163");
        passengerElements.selectSex2("Male");
        passengerElements.writeTelephone2("902292248");
        passengerElements.writeEmail2("evictorio.uni@gmail.com");
        passengerElements.writeConfirmEmail2("evictorio.uni@gmail.com");
        passengerElements.clickContinueToPayment2();
    }

    @Then("^I verify the \"([^\"]*)\"$")
    public void iVerifiyTotalPrice(String totalPrice) {
        paymentPage paymentElements = new paymentPage(driver);
        Assert.assertEquals(paymentElements.getTotalPrice2(),totalPrice,"The information is not equals");
    }

    @Then("^I verify the \"([^\"]*)\" and the \"([^\"]*)\"$")
    public void iVerifyTotalPriceAndTrainSelected(String totalPrice, String trainSelected){
        paymentPage paymentElements = new paymentPage(driver);
        paymentElements.clickPurchaseSummary();
        Assert.assertEquals(paymentElements.getTotalPrice(),totalPrice,"The information is not equals");
        Assert.assertEquals( paymentElements.getTrainSelected(),trainSelected,"The information is not equals");
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
