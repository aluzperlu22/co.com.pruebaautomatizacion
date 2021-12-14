package co.com.pruebaautomatizacion.stepdefinitions;

import co.com.pruebaautomatizacion.questions.ValidarElemento;
import co.com.pruebaautomatizacion.tasks.AbrirPagina;
import co.com.pruebaautomatizacion.tasks.IngresarCredenciales;
import co.com.pruebaautomatizacion.tasks.RealizarCompra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import static co.com.pruebaautomatizacion.userinterfaces.PantallaCompraExitosa.VALIDACION_COMPRA_EXITOSA;
import static co.com.pruebaautomatizacion.userinterfaces.PantallaDeBienvenida.VALIDACION_LOGIN_EXITOSO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStep {

    @Dado("^que (.*) abre la pagina de Automation practice$")
    public void abrirUrl(String actor) {
        theActorCalled(actor).attemptsTo(AbrirPagina.principal());
    }

    @Dado("^que (.*) ingresa con usuario: (.*) y clave: (.*)$")
    @Cuando("(.*) ingresa con usuario: (.*) y clave: (.*)")
    public void inicioSesion(String actor, String usuario, String clave) {
        theActorCalled(actor).attemptsTo(IngresarCredenciales.enLaPagina(usuario, clave));
    }

    @Entonces("^ella podra ver el mensaje de bienvenida$")
    public void ellaVeraLaBienvenida() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElemento.esVisible(VALIDACION_LOGIN_EXITOSO)));
    }

    @Y("^ella realiza una compra de un blusa$")
    public void ellaRealizaUnaCompraDeUnaBlusa() {
        theActorInTheSpotlight().attemptsTo(RealizarCompra.deBlusa());

    }

    @Entonces("^podra ver que su compra fue exitosa$")
    public void ellaPodraVerCompraExitosa() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElemento.esVisible(VALIDACION_COMPRA_EXITOSA)));
    }

}



