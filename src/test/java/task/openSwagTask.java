package task;


import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class openSwagTask implements Task {

    EnvironmentVariables environmentVariables;

    public openSwagTask(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("base.url")));
    }
    public static Performable abrirNavegador() {
        return instrumented(openSwagTask.class);
    }
}
