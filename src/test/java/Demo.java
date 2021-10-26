import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    static{
        System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
    }

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
    }
}
