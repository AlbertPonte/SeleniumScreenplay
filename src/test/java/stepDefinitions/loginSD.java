package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import task.openSwagTask;
import task.loginTask;

public class loginSD {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el (cliente) ha accedido a la web Swablab$")
    public void queElClienteHaAccedidoALaWebSwablab(String user) {
        theActorCalled(user).attemptsTo(openSwagTask.abrirNavegador());
    }

    @Given("^se ha logueado con el (.*) y (.*)$")
    public void seHaLogueadoConElStandardUserYsecretSauce(String usuario, String contrasena) {
        theActorInTheSpotlight().wasAbleTo(loginTask.iniciarSesion(usuario, contrasena));
    }

}
