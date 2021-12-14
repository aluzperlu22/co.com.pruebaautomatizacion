#language:es

  @Compra

  Característica: Comprar Prenda De Vestir
    Yo como usuario de la pagina de automation practice
  quiero realizar una compra
  para poder validar la funcionalidad del modulo

  @LoginExitoso
    Escenario: Inicio de sesion exitoso
    Dado que Ada abre la pagina de Automation practice
    Cuando Ada ingresa con usuario: aluzperlu22@gmail.com y clave: aluzperlu22
    Entonces ella podra ver el mensaje de bienvenida

  @CompraExitosa
    Escenario: Realizar compra exitosa
    Dado que Ada abre la pagina de Automation practice
    Cuando Ada ingresa con usuario: aluzperlu22@gmail.com y clave: aluzperlu22
    Y ella realiza una compra de un blusa
    Entonces podra ver que su compra fue exitosa
