package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class passengerPage{

    WebDriver driver;

    public passengerPage(WebDriver browser) {
        driver = browser;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@id='txt_nombre[suite][cab1][1]'])[1]")
    private WebElement textBoxFirstName;

    @FindBy(xpath = "(//input[@id='txt_apellido[suite][cab1][1]'])[1]")
    private WebElement textBoxLastName;

    @FindBy(xpath = "(//input[@id='txt_fecha_nacimiento[suite][cab1][1]'])[1]")
    private WebElement calendarDateofBirth;

    @FindBy(css = ".ui-datepicker-month")
    private WebElement listMonth;

    @FindBy(css = ".ui-datepicker-year")
    private WebElement listYear;

    @FindBy(xpath = "//a[normalize-space()='22']")
    private WebElement dayOptionto22;

    @FindBy(xpath = "(//select[@id='sel_nacion[suite][cab1][1]'])[1]")
    private WebElement listNationality;

    @FindBy(xpath = "(//select[@id='sel_tpdoc[suite][cab1][1]'])[1]")
    private WebElement listKindofDocument;

    @FindBy(xpath = "(//input[@id='txt_nroid[suite][cab1][1]'])[1]")
    private WebElement textBoxDocumentNumber;

    @FindBy(xpath = "(//select[@id='sel_sexo[suite][cab1][1]'])[1]")
    private WebElement listSex;

    @FindBy(xpath = "(//input[@id='txt_telefono[suite][cab1][1]'])[1]")
    private WebElement textBoxTelephone;

    @FindBy(xpath = "(//input[@id='txt_mail[suite][cab1][1]'])[1]")
    private WebElement textBoxEmail;

    @FindBy(xpath = "(//input[@id='txt_mail_conf[suite][cab1][1]'])[1]")
    private WebElement textBoxConfirmEmail;

    @FindBy(css = "#btnContinuarPas")
    private WebElement buttonContinue;

    @FindBy(css = "#formPasajero1-nomPasajero")
    private WebElement labelNames;

    @FindBy(css = "#formPasajero1-apePasajero")
    private WebElement labelSurname;

    @FindBy(id = "formPasajero1-fecNacimiento")
    private WebElement clickDateofBirth;

    @FindBy(css = "#calendario_anio")
    private WebElement listYearBirth;

    @FindBy(css = "#calendario_mes")
    private WebElement listMonthBirth;

    @FindBy(css = "#formPasajero1-idPais")
    private WebElement listNationality2;

    @FindBy(css = "#formPasajero1-idDocumentoIdentidad")
    private WebElement listTypeofDocument2;

    @FindBy(css = "#formPasajero1-idSexo")
    private WebElement listSex2;

    @FindBy(css = "#formPasajero1-numTelefono")
    private WebElement textBoxTelephone2;

    @FindBy(css = "#formPasajero1-desEmail")
    private WebElement textBoxEmail2;

    @FindBy(css = "#formPasajero1-desEmailConfirmacion")
    private WebElement textBoxConfirmEmail2;

    @FindBy(css = "#enviarPago")
    private WebElement buttonContinuetoPayment2;

    @FindBy(xpath = "(//input[@id='formPasajero1-numDocumentoIdentidad'])[1]")
    private WebElement getTextBoxDocumentNumber2;

    public void writeFirstName(String firstName){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxFirstName));
        textBoxFirstName.sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxLastName));
        textBoxLastName.sendKeys(lastName);
    }

    public void selectNationality(String nationality){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listNationality));
        Select dropdown = new Select(listNationality);
        dropdown.selectByVisibleText(nationality);
    }

    public void selectKindOfDocument(String kindOfDocument){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listKindofDocument));
        Select dropdown = new Select(listKindofDocument);
        dropdown.selectByVisibleText(kindOfDocument);
    }

    public void writeDocumentNumber(String documentNumber){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxDocumentNumber));
        textBoxDocumentNumber.sendKeys(documentNumber);
    }

    public void selectSex(String sex){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listSex));
        Select dropdown = new Select(listSex);
        dropdown.selectByVisibleText(sex);
    }

    public void writeTelephone(String telephone){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxTelephone));
        textBoxTelephone.sendKeys(telephone);
    }

    public void writeEmail(String email){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
        textBoxEmail.sendKeys(email);
    }

    public void writeConfirmEmail(String confirmEmail){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxConfirmEmail));
        textBoxConfirmEmail.sendKeys(confirmEmail);
    }

    public void clickContinueToPayment(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonContinue));
        buttonContinue.click();
    }

    public void clickCalendarDateofBirth(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(calendarDateofBirth));
        calendarDateofBirth.click();
    }

    public void clickDayOption22(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(dayOptionto22));
        dayOptionto22.click();
    }

    public void selectMonth(String month){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listMonth));
        Select dropdown = new Select(listMonth);
        dropdown.selectByVisibleText(month);
    }

    public void selectYear(String year){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listYear));
        Select dropdown = new Select(listYear);
        dropdown.selectByVisibleText(year);
    }

    public void writeNames(String firstName){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(labelNames));
        labelNames.sendKeys(firstName);
    }

    public void writeSurname(String surName){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(labelSurname));
        labelSurname.sendKeys(surName);
    }

    public void clickDateofBirth(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(clickDateofBirth));
        clickDateofBirth.click();
    }

    public void selectYearBirth(String yearBirth){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listYearBirth));
        Select dropdown = new Select(listYearBirth);
        dropdown.selectByVisibleText(yearBirth);
    }

    public void selectMonthBirth(String monthBirth){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listMonthBirth));
        Select dropdown = new Select(listMonthBirth);
        dropdown.selectByVisibleText(monthBirth);
    }

    public void selectNationality2(String nationality2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listNationality2));
        Select dropdown = new Select(listNationality2);
        dropdown.selectByVisibleText(nationality2);
    }

    public void selectKindOfDocument2(String kindofDocument2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listTypeofDocument2));
        Select dropdown = new Select(listTypeofDocument2);
        dropdown.selectByVisibleText(kindofDocument2);
    }

    public void writeDocument2(String document2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(getTextBoxDocumentNumber2));
        getTextBoxDocumentNumber2.sendKeys(document2);
    }

    public void selectSex2(String sex2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(listSex2));
        Select dropdown = new Select(listSex2);
        dropdown.selectByVisibleText(sex2);
    }

    public void writeTelephone2(String telephone2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxTelephone2));
        textBoxTelephone2.sendKeys(telephone2);
    }

    public void writeEmail2(String email2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxEmail2));
        textBoxEmail2.sendKeys(email2);
    }

    public void writeConfirmEmail2(String confirmEmail2){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(textBoxConfirmEmail2));
        textBoxConfirmEmail2.sendKeys(confirmEmail2);
    }

    public void clickContinueToPayment2(){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(buttonContinuetoPayment2));
        buttonContinuetoPayment2.click();
    }


}
