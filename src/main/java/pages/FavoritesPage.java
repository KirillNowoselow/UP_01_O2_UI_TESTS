package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class FavoritesPage {
    private final ElementsCollection favoritesElements = $$x("//div[@class='favorite-snippet-column-2-dLNCe']//a");
    private final ElementsCollection nameFavoritesElements = $$x("//div[@class='favorite-snippet-column-2-dLNCe']//a//p//strong");

    public String getHrefFavorit(){
        return favoritesElements.first().getAttribute("href");
    }

    public String getNameFavorit(){
        return nameFavoritesElements.first().name();
    }
}
