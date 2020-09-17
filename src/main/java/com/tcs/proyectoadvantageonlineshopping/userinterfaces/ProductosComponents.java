package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosComponents {

    public static final Target PRODUCTO = Target
            .the("Productos {0}")
            .locatedBy("//*[text()='{0}']");

    public static final Target BOTON_ADD_TO_CART = Target
            .the("Boton Add to Cart")
            .locatedBy("//button[@name='save_to_cart']");

    public static final Target CAMPO_CANTIDAD = Target
            .the("Agrega la cantidad")
            .locatedBy("//input[@name='quantity']");

}
