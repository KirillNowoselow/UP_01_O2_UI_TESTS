import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class UiTests extends BaseTest{
    @Test(description = "Проверка поиска и ссылки")
    public void checkHref(){
        UI_TEST_STEPS.getHref();
    }

    @Test(description = "Проверка добавления в избранное")
    public void checkFavorites(){ UI_TEST_STEPS.addFavorites(); }

}
