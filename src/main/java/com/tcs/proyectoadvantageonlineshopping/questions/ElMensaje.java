package com.tcs.proyectoadvantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.PagoComponents.*;

public class ElMensaje implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        ORDER_PAYMENT.resolveFor(actor).getText();
        return Text.of(ORDER_PAYMENT).viewedBy(actor).asString();
    }

    public static ElMensaje mostrado() {
        return new ElMensaje();
    }
}
