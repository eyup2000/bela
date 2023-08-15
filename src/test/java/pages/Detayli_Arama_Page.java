package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Detayli_Arama_Page {
    public Detayli_Arama_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='pmkTL  btnDetayliHastaAra']")
    public WebElement DetayliHastaAra;

    @FindBy(xpath = "//div[@class='chck_block marleftpx5']")
    public WebElement SadeceBugunGelis;

    @FindBy(xpath = "(//*[@id=\"PROTOKOL_NO\"])[2]")
    public WebElement ProtocolNo;

    @FindBy(xpath ="//*[@class=\"inpt wpx225\"]")
    public WebElement TCKimlikNo;

    @FindBy(xpath = "//*[@data-col-name=\"HASTA_NO\"]")
    public WebElement HASTANo;
}
