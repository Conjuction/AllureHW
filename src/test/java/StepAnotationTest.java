import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class StepAnotationTest extends TestBase{
    @Step("Open main page")
    public void openMainPage() {
        open(URL);
    }

    @Step("Find repository")
    public void findRepository() {
        inputSearch.click();
        inputSearch.sendKeys(REPOSITORY);
        inputSearch.pressEnter();
    }

    @Step("Click repo link")
    public void clickRepoLink() {
        $(linkText(REPOSITORY)).click();
    }

    @Step("Open Tab issue")
    public void openIssueTab() {
        $(issuesTab).click();
    }

    @Step("Verify issue name")
    public void verifyIssueName() {
        $(withText(String.valueOf(ISSUE_NUMBER))).should(Condition.exist);
    }
}
