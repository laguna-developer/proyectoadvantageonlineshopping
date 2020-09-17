package com.tcs.proyectoadvantageonlineshopping.tasks;

import com.tcs.proyectoadvantageonlineshopping.models.DatosTarjeta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.CarritoComponents.*;
import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.HomeComponents.HOME_PAGINA;
import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.PagoComponents.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PagarProductos implements Task {

    private DatosTarjeta datosTarjeta;

    public PagarProductos(DatosTarjeta datosTarjeta) {
        this.datosTarjeta = datosTarjeta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ICON_CART));
        actor.attemptsTo(Click.on(BTN_CHECKOUT));
        actor.attemptsTo(Click.on(BTN_NEXT));
        actor.attemptsTo(Click.on(RADIO_MASTERCREDIT));
        actor.attemptsTo(Click.on(EDIT));
        actor.attemptsTo(Enter.theValue(datosTarjeta.getCartNumber()).into(CART_NUMBER),
                Enter.theValue(String.valueOf(datosTarjeta.getCvvNumber())).into(CVV_NUMBER),
                SelectFromOptions.byVisibleText(String.valueOf(datosTarjeta.getMmExpiration())).from(MM_EXPRIRED),
                SelectFromOptions.byVisibleText(String.valueOf(datosTarjeta.getYyExpiration())).from(AA_EXPRIRED),
                Enter.theValue(datosTarjeta.getCardholder()).into(CARDHOLDER_NAME));
        actor.attemptsTo(Click.on(BTN_PAY_NOW));
    }

    public static PagarProductos conLos(DatosTarjeta datosTarjeta) {
        return Tasks.instrumented(PagarProductos.class, datosTarjeta);
    }
}
