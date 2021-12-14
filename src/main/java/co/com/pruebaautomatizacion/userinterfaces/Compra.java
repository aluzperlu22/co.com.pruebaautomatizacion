package co.com.pruebaautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Compra {

    public static final Target BTN_HOME = Target.the("boton de ingresar a home").located(By.id("header_logo"));
    public static final Target SELECCIONA_BLUSA = Target.the("boton Seleccionar prenda ").locatedBy("//*[contains(text(),'Faded Short Sleeve T-shirts')]");
    public static final Target AGREGAR_AL_CARRO = Target.the("boton de agregar al carrito ").located(By.id("add_to_cart"));
    public static final Target REALIZAR_CHECKOUT = Target.the("boton de realizar chekcout").locatedBy("//*[contains(text(),'Proceed to checkout')]");
    public static final Target CONFIRMAR_CHEKOUT = Target.the("boton de confirmar chekout ").locatedBy("//*[@id='center_column']/p[2]/a[1]");
    public static final Target CONFIRMAR_CHEKOUT_ADDRESS = Target.the("boton de confirmar chekout en direccion ").locatedBy("//*[@id=\"center_column\"]/form/p/button/span/i");
    public static final Target ACEPTAR_TERMINOS = Target.the("boton aceptar terminos y condiciones ").located(By.id("uniform-cgv"));
    public static final Target CONFIRMAR_CHEKOUT_SHOPPING = Target.the("boton de confirmar chekout en compra ").locatedBy("//*[@id='form']/p/button/span/i");
    public static final Target SELEC_PAYMENTH = Target.the("boton seleccionar medio de pago ").locatedBy("//*[contains(text(),'Pay by bank wire')]");
    public static final Target CONFIRMAR_PAGO = Target.the("boton confirmar pago ").locatedBy("//*[contains(text(),'I confirm my order')]");
    public static final Target VALIDACION_COMPRA_EXITOSA = Target.the("Validacion Compra exitosa ").locatedBy("//*[contains(text(),'Your order on My Store is complete.')]");
}
