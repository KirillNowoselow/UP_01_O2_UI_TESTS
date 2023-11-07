package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final ElementsCollection searchElements = $$x("//div[@class='iva-item-title-py3i_']//a");
    private final ElementsCollection nameSearchElements = $$x("//div[@class='iva-item-title-py3i_']//a//h3");
    private final ElementsCollection favoritesAddElements = $$x("//div[@data-marker='favorites-add']");
    private final SelenideElement favorites = $x("//a[@data-marker='header/favorites']");
    public String getHref(){
        return searchElements.first().getAttribute("href");
    }
    public String getNameElements(){
        return nameSearchElements.first().name();
    }
    public void clickFavoritesAdd(){
        favoritesAddElements.first().click();
    }
    public FavoritesPage favoritesClick(){
        favorites.click();
        return new FavoritesPage();
    }
}
