package com.tcs.proyectoadvantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.BannerSuperiorComponents.*;

public class ElUsuario implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        ICON_USER_REGISTRADO.resolveFor(actor).getText();
        return Text.of(ICON_USER_REGISTRADO).viewedBy(actor).asString();
    }

    public static ElUsuario registrado(){
        return new ElUsuario();
    }
}
