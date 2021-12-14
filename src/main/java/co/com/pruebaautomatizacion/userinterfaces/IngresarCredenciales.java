package co.com.pruebaautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IngresarCredenciales {

    public static final Target BTN_USUARIO = Target.the("Escribir usuario").locatedBy("//*[@id=\"email\"]");
    public static final Target TXT_USUARIO = Target.the("Escribir usuario").locatedBy("//*[@id=\"email\"]");
    public static final Target TXT_CLAVE = Target.the(" Ingresar clave").locatedBy("//*[@id=\"passwd\"]");
    public static final Target BTN_INGRESAR = Target.the(" Ingresar clave").locatedBy("//*[@id=\"SubmitLogin\"]/span");

}
