import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TestBase {
    protected final static String URL = "https://github.com/";
    protected final String ALLURE_REPO = "selenide/selenide";
    protected final SelenideElement mainPageSearch = $(".header-search-input");
    protected final SelenideElement issuesTab = $("#issues-tab");

    protected final int ISSUE_NUMBER = 2152;
}
