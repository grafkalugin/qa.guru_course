import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");

        $("[name=q]").setValue("sel").pressEnter();
        $("[name=q]").append("enide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}