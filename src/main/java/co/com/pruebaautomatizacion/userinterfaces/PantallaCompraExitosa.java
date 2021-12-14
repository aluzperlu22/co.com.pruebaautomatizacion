package co.com.pruebaautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PantallaCompraExitosa {

    public static final Target VALIDACION_COMPRA_EXITOSA = Target.the("Validacion Compra exitosa ").locatedBy("//*[contains(text(),'Your order on My Store is complete.')]");

}
