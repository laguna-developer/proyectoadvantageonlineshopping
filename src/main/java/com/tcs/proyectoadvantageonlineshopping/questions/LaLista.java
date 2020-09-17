package com.tcs.proyectoadvantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.PagoComponents.SHOPPING_CART;

public class LaLista implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        SHOPPING_CART.resolveFor(actor).getText();
        return Text.of(SHOPPING_CART).viewedBy(actor).asString();

    }

    public static LaLista deProductos(){
        return new LaLista();
    }
}
