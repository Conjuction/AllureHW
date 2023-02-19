import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideListenerTest extends TestBase {
    @Test
    public void checkPage() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open(URL);

        inputSearch.click();
        inputSearch.sendKeys(REPOSITORY);
        inputSearch.pressEnter();

        $(linkText(REPOSITORY)).click();
        $(issuesTab).click();
        $(withText((ISSUE_NUMBER))).should(Condition.exist);
    }


    @Test
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepAnotationTest steps = new StepAnotationTest();

        steps.openMainPage();
        steps.findRepository();
        steps.clickRepoLink();
        steps.openIssueTab();
        steps.verifyIssueName();
    }
}
