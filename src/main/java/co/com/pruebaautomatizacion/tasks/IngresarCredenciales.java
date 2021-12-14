package co.com.pruebaautomatizacion.tasks;

import co.com.pruebaautomatizacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pruebaautomatizacion.userinterfaces.IngresarCredenciales.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCredenciales implements Task {

    private final String usuario;
    private final String clave;

    public IngresarCredenciales(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BTN_USUARIO),
                Click.on(co.com.pruebaautomatizacion.userinterfaces.IngresarCredenciales.BTN_USUARIO),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into((TXT_CLAVE)),
                Click.on(BTN_INGRESAR)
        );
    }

    public static IngresarCredenciales enLaPagina(String usuario, String clave) {
        return instrumented(IngresarCredenciales.class,usuario,clave);
    }
}
