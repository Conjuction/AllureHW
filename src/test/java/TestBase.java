import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TestBase {
    public final static String URL = "https://github.com/";
    public final String REPOSITORY = "selenide/selenide";
    public final SelenideElement inputSearch = $(".header-search-input");
    public final SelenideElement issuesTab = $("#issues-tab");
    public final String ISSUE_NUMBER = "#2152";
}
