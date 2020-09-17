package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeComponents {
    public static final Target LOADER = Target
            .the("Cargando")
            .locatedBy("//div[@class='loader']");

    public static final Target HOME_PAGINA = Target
            .the("Pagina Principal")
            .locatedBy("//article[@id='our_products']");
}