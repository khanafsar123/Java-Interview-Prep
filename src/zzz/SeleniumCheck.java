package zzz;

public class SeleniumCheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver_win32.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");



    }
}
