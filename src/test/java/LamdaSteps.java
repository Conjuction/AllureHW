import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LamdaSteps extends TestBase{
    @Test
    public void lambdaStepsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page", () -> {
            open(URL);
        });
        step("Find repository " + REPOSITORY, () -> {
            inputSearch.click();
            inputSearch.sendKeys(REPOSITORY);
            inputSearch.pressEnter();
        });
        step("Click repo link " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Open tab issue " + issuesTab, () -> {
            $(issuesTab).click();
        });
        step("Verify issue name " + ISSUE_NUMBER, () -> {
            $(withText((ISSUE_NUMBER))).should(Condition.exist);
        });
    }

}
