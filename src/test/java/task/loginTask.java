package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.loginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class loginTask implements Task {

    private final String usuario;
    private final String contrasena;

    public loginTask(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public static Performable iniciarSesion(String usuario, String contrasena) {
        return instrumented(loginTask.class,usuario,contrasena);
    }

    @Override
     public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(loginUI.campo_Usuario),
                Enter.theValue(contrasena).into(loginUI.campo_Contrasena),
                Click.on(loginUI.boton_Login)
        );
    }


}
