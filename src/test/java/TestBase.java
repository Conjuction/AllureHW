import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TestBase {
    protected final static String URL = "https://github.com/";
    protected final String REPOSITORY = "selenide/selenide";
    protected final SelenideElement inputSearch = $(".header-search-input");
    protected final SelenideElement issuesTab = $("#issues-tab");

    protected final String ISSUE_NUMBER = "#2152";
}
