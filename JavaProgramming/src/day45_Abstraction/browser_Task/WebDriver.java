package day45_Abstraction.browser_Task;

public interface WebDriver extends SearchContext{

    void get(String url);


    void close();


    void quit();


    void getTitle();
}
