package day38_Inheritance.browserTask;

public class Safari extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari browser");
    }
}
