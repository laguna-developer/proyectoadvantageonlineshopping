package com.tcs.proyectoadvantageonlineshopping.tasks;

import com.tcs.proyectoadvantageonlineshopping.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.BannerSuperiorComponents.*;
import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.FormularioLoginComponents.*;

public class Loguearse implements Task {
    private String username;
    private String password;

    public Loguearse(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ICON_USER));
        actor.attemptsTo(Enter.theValue(username).into(CAMPO_USERNAME_LOGIN),
                Enter.theValue(password).into(CAMPO_PASSWORD_LIGIN));
        actor.attemptsTo(Click.on(BTN_SIGN_IN));
    }

    public static Loguearse conLas(Credenciales credenciales){
        return new Loguearse(credenciales.getUsername(), credenciales.getPassword());
    }

}
