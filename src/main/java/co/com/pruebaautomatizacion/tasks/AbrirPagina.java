package co.com.pruebaautomatizacion.tasks;

import co.com.pruebaautomatizacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.pruebaautomatizacion.userinterfaces.PaginaDeInicio.BTN_SING_IN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPagina implements Task {

    public static AbrirPagina principal() {
        return instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("http://automationpractice.com/index.php"),
                EsperarElemento.esClickable(BTN_SING_IN),
                Click.on(BTN_SING_IN)
        );
    }

}


