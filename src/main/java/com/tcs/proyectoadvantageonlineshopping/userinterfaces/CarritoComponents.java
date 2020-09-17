package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoComponents {
    public static final Target ICON_CART = Target
            .the("Icono Carrito")
            .located(By.id("menuCart"));

    public static final Target BTN_CHECKOUT = Target
            .the("Boton CHECKOUT")
            .located(By.id("checkOutButton"));

    public static final Target BTN_NEXT = Target
            .the("Boton NEXT")
            .located(By.id("next_btn"));

    public static final Target RADIO_MASTERCREDIT = Target
            .the("Boton Medio de Pago MASTERCREDIT")
            .locatedBy("//input[@name='masterCredit']");

    public static final Target EDIT = Target
            .the("Editar datos de la tarjeta")
            .locatedBy("//label[@class='edit  ng-scope']");

}
