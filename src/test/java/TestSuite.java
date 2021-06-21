import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSuite {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        Run chromedriver
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();
    }

    @Test
    public void TC01_searchProduct() {
        String xPathInputSearch = "//input[@data-view-id='main_search_form_input']";
        String xPathBtnSearch = " //button[@data-view-id='main_search_form_button']";
        String xPathBtnSearch1 = "//button[contains(text(), 'Tìm Kiếm')]";
        String xPathProduct = "//div[@data-view-id='product_list_container']//img[starts-with(@alt, 'Laptop Asus VivoBook S14 S433EA-AM439T')]";
        String xPathTitleProduct ="//h1[contains(text(), 'Laptop Asus VivoBook S14 S433EA-AM439T')]";
        String xPathPriceCurrent = "//span[@class='product-price__current-price']";
        String xPathNumbProduct = "//input[@class='input' and @type='text']";
        String xPathTimeBH = "//span[contains(text(), 'Thời gian bảo hành')]/following-sibling::span ";
        String xPathHinhThucBH = "//span[contains(text(), 'Hình thức bảo hành')]/following-sibling::span ";
        String xPathPlaceBH = "//span[contains(text(), 'Hướng dẫn bảo hành')]/following-sibling::span ";
        String xPathBtnChonMua = "//button[contains(text(), 'Chọn mua')]";



    }
}
