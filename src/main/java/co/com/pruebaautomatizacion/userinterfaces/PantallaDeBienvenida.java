package co.com.pruebaautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PantallaDeBienvenida {

    public static final Target VALIDACION_LOGIN_EXITOSO = Target.the("Validacion En pantalla login exitoso").locatedBy("//*[contains(text(),'Welcome to your account.')]");
}
