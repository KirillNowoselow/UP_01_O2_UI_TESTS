package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage  {
    private final SelenideElement search = $x("//input[@data-marker='search-form/suggest']");
    public MainPage(String url){
        Selenide.open(url);
    }

    public SearchPage search(String searchString){
        search.setValue(searchString);
        search.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
