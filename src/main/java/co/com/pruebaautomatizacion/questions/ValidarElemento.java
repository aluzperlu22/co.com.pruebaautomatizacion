package co.com.pruebaautomatizacion.questions;

import co.com.pruebaautomatizacion.interactions.esperas.Esperar;
import co.com.pruebaautomatizacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.pruebaautomatizacion.userinterfaces.PantallaCompraExitosa.VALIDACION_COMPRA_EXITOSA;

public class ValidarElemento implements Question<Boolean> {

    Target elemento;

    public ValidarElemento(Target elemento) {
        this.elemento = elemento;
    }

    public static ValidarElemento esVisible(Target elemento) {
        return new ValidarElemento(elemento);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Esperar.unTiempo(5000));
        boolean resultado = elemento.resolveFor(actor).isVisible();
        return resultado;
    }
}