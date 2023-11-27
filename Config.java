public class Config  {

    public static void configInit () {
        WebDriver d = new FirefoxDriver();
        d.manage().window().maximize(); //always write wait code after this
        d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
    }
}