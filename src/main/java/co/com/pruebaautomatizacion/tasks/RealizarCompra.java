package co.com.pruebaautomatizacion.tasks;

import co.com.pruebaautomatizacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.pruebaautomatizacion.userinterfaces.Compra.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BTN_HOME),
                Click.on(BTN_HOME),
                EsperarElemento.esClickable(SELECCIONA_BLUSA),
                Click.on(SELECCIONA_BLUSA),
                EsperarElemento.esClickable(AGREGAR_AL_CARRO),
                Click.on(AGREGAR_AL_CARRO),
                EsperarElemento.esClickable(REALIZAR_CHECKOUT),
                Click.on(REALIZAR_CHECKOUT),
                EsperarElemento.esClickable(CONFIRMAR_CHEKOUT),
                Click.on(CONFIRMAR_CHEKOUT),
                EsperarElemento.esClickable(CONFIRMAR_CHEKOUT_ADDRESS),
                Click.on(CONFIRMAR_CHEKOUT_ADDRESS),
                EsperarElemento.esClickable(ACEPTAR_TERMINOS),
                Click.on(ACEPTAR_TERMINOS),
                Click.on(CONFIRMAR_CHEKOUT_SHOPPING),
                EsperarElemento.esClickable(SELEC_PAYMENTH),
                Click.on(SELEC_PAYMENTH),
                EsperarElemento.esClickable(CONFIRMAR_PAGO),
                Click.on(CONFIRMAR_PAGO)
        );
    }

    public static RealizarCompra deBlusa() {
        return instrumented(RealizarCompra.class);
    }

}
