package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriasComponents {
    public static final Target CATEGORIA = Target
            .the("Categoria {0}")
            .locatedBy("//span[text()='{0}']");
}
