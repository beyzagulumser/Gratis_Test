package tests;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.*;
import static utilities.ExcelUtils.*;

public class GratisTest {


    @BeforeClass
    public void openSite(){

        Driver.getDriver().get(ConfigReader.getProperty("gratisURL"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.gratis.com/");

    }

    @AfterClass
    public void closeSite(){
        Driver.closeDriver();
    }


    @Test
    public void selectProduct(){

        MainPage mainPage= new MainPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(mainPage.ciltBakimi).perform();
        bekle(3);
        mainPage.ciltKategori.click();
        bekle(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cilt-nemlendirici-urunler"));
        mainPage.checkbox1.click();
        bekle(3);
        mainPage.checkbox2.click();
        bekle(4);
        writeToExcel(mainPage.ürün,mainPage.ürünTutar,"Ürün Listesi");
        bekle(3);
        actions.moveToElement(mainPage.ürün).perform();
        mainPage.sepeteEkle.click();
        bekle(2);
        Assert.assertTrue(mainPage.sepeteEkleUyari.isDisplayed());
        bekle(3);
        mainPage.girisYap1.click();
        bekle(2);
        mainPage.girisYap2.click();
        bekle(2);
        actions.moveToElement(mainPage.magazalarimiz).perform();
        bekle(1);
        writeToTextBoxFromExcel();
        bekle(5);
        tumSayfaResmi("SON");



    }




}
