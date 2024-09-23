package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class loginUI extends PageObject {
    public static final Target campo_Usuario =Target.the("ingresa el usuario").locatedBy("//*[@id=\"user-name\"]");
    public static final Target campo_Contrasena= Target.the("ingresa el password").locatedBy("//*[@id='password']");
    public static final Target boton_Login = Target.the("Clic en login").locatedBy("//*[@id='login-button']");
}
