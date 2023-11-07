package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchPage;

public class UiTestSteps {
    private final static String BASE_URL = "https://www.avito.ru/";

    @Step("Получение ссылки и проверка")
    public void getHref(){
        MainPage mainPage = new MainPage(BASE_URL);
        String href = mainPage.search("mazda").getHref();
        System.out.println(href);
        Assert.assertTrue(href.contains("mazda"));
    }

    @Step("Добавление в избранное")
    public void addFavorites(){
        MainPage mainPage = new MainPage(BASE_URL);
        SearchPage searchPage = mainPage.search("mazda");
        searchPage.clickFavoritesAdd();
        String actualHref = searchPage.getNameElements();
        String expectedHref = searchPage.favoritesClick().getNameFavorit();
        Assert.assertEquals(actualHref,expectedHref);
    }
}
