package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.annotations.ClearCookiesPolicy;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features ="src/test/resources/demo/",
        glue = "stepDefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class runner {

    @Managed(uniqueSession = true, clearCookies = ClearCookiesPolicy.BeforeEachTest)
      WebDriver driver;
}
