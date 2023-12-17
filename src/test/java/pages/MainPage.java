package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

   @FindBy (xpath = "//*[@class='category-502 mega-menu-drop ng-star-inserted']")
   public WebElement ciltBakimi;

    @FindBy (xpath = "//*[@class='50202 mm-head-navs']")
    public WebElement ciltKategori;

    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/main/cx-page-layout/cx-page-slot/app-product-grid/div/div/div/div[2]/cx-page-slot/app-custom-product-facet-navigation/app-custom-facet-list/div/app-custom-facet[3]/div[2]/a[1]")
    //@FindBy (xpath = "//a[@class='value facet-value-link facet-value-link-for-multi-select ng-star-inserted' and contains(@href, 'Bee Beauty')]'")
    public WebElement checkbox1;

    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/main/cx-page-layout/cx-page-slot/app-product-grid/div/div/div/div[2]/cx-page-slot/app-custom-product-facet-navigation/app-custom-facet-list/div/app-custom-facet[3]/div[2]/a[2]")
    public WebElement checkbox2;

    @FindBy (xpath = "(//*[@class='cx-product-name'])[1]")
    public WebElement ürün;

    @FindBy (xpath = "(//*[@class='product-price'])[1]")
    public WebElement ürünTutar;


 @FindBy(xpath = "/html/body/app-root/app-custom-storefront/div/main/cx-page-layout/cx-page-slot/app-product-grid/div/div/div/div[3]/cx-page-slot/app-custom-product-list/div/div[2]/div/app-custom-product-grid-item[1]/div/div[1]/div/app-custom-add-to-cart/form/button")
 public WebElement sepeteEkle;
    @FindBy(xpath = "//*[@class='ng-tns-c160-0 ng-star-inserted' and text()=' Ürün Sepetinize Eklendi ']")
    public WebElement sepeteEkleUyari;

    //@FindBy (xpath = "//*[@class='high-text' and text()='Giriş Yap']")
    //@FindBy (xpath = "//span[@class='high-text' and contains(text(), 'Giriş Yap')]")
    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/header/app-header/app-header-one/div[2]/div/div[2]/div/cx-page-slot/app-custom-login/div/a/span[1]")
    public WebElement girisYap1;


    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/header/app-header/app-header-one/div[2]/div/div[2]/div/cx-page-slot/app-custom-login/div/div/app-custom-account-dropdown-navigation/ul/li[1]/a")
    public WebElement girisYap2;

    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/main/cx-page-layout/cx-page-slot[1]/app-custom-login-form/section/div/div/div/div/app-custom-form-for-login/form/div[1]/input")
    public WebElement eposta;

    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/main/cx-page-layout/cx-page-slot[1]/app-custom-login-form/section/div/div/div/div/app-custom-form-for-login/form/div[2]/input")
    public WebElement password;

    @FindBy (xpath = "/html/body/app-root/app-custom-storefront/div/footer/cx-page-layout/cx-page-slot/app-custom-paragraph/div/div/footer/div[1]/div/ul/li[1]/a/span")
    public WebElement magazalarimiz;





}
