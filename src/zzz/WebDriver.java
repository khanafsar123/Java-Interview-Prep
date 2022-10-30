package zzz;

public interface WebDriver {
 void open();
 void close();
 String getTitle();

    void get(String s);
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver, TakeScreenshot{
    @Override
    public void open() {
        System.out.println("chrome Open");

    }

    @Override
    public void close() {
        System.out.println("chrome close");
    }
    @Override
    public String getTitle() {
        String title="google.com";
        System.out.println(title);
        return title;
    }

    @Override
    public void get(String s) {

    }

    @Override
    public void navigate() {
        System.out.println("forward to google");

    }


    @Override
    public void getScreenshot() {
        System.out.println("Chrome screenshot");
    }
}
class FirefoxDriver implements RemoteWebDriver, TakeScreenshot{
    public void open(){
        System.out.println("firefox open");
    }
    public void close(){
        System.out.println("firefox close");
    }

    @Override
    public String getTitle() {
        String title="FireFox";
        System.out.println(title);
        return title;
    }

    @Override
    public void get(String s) {

    }

    public void navigate(){
        System.out.println("navigate firefox to google.com");
    }
    @Override
    public void getScreenshot(){
        System.out.println("take screenshot of open browser in Firefox");

    }
}
class SafariDriver implements RemoteWebDriver, TakeScreenshot{
    public void open(){
        System.out.println("safari open");
    }
    public void close(){
        System.out.println("safari close");    }
    public String getTitle(){
        String title="SafariTitle";
        System.out.println(title);
    return title;
    }

    @Override
    public void get(String s) {

    }

    public void navigate() {
        System.out.println("navigage safari");

    }
    @Override
    public void getScreenshot(){
        System.out.println("get Screenshot");
    }
}

class Test3{
    public static void main(String[] args) {

        TakeScreenshot [] webDriver={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

            for (int i=0; i< webDriver.length; i++){

                    webDriver[i].open();
                    webDriver[i].close();
                    webDriver[i].getTitle();
                    webDriver[i].getScreenshot();
            }

            for(TakeScreenshot obj:webDriver) {

                obj.getScreenshot();
                obj.close();
                obj.open();
                obj.getTitle();
                obj.navigate();


            }








    }

}