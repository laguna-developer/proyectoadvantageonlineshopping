package com.tcs.proyectoadvantageonlineshopping.tasks;

import com.tcs.proyectoadvantageonlineshopping.models.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.BannerSuperiorComponents.*;
import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.CarritoComponents.*;

public class AgregarProductos implements Task {
    private List<Productos> listaDeProductos;

    public AgregarProductos(List<Productos> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < listaDeProductos.size(); i++) {
            actor.attemptsTo(Agregar.deLa(listaDeProductos.get(i)));
            actor.attemptsTo(Click.on(ADVANTAGE_DEMO));
        }
        actor.attemptsTo(Click.on(ICON_CART));
    }

    public static AgregarProductos deLaLista(List<Productos> listaProductos) {
        return Tasks.instrumented(AgregarProductos.class, listaProductos);
    }
}



