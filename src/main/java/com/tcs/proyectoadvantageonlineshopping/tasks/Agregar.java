package com.tcs.proyectoadvantageonlineshopping.tasks;

import com.tcs.proyectoadvantageonlineshopping.models.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.CategoriasComponents.*;
import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.ProductosComponents.*;

public class Agregar implements Task {

    private Productos productos;

    public Agregar(Productos productos) {
        this.productos = productos;
    }

    @Step("{0} agrega el producto #producto")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CATEGORIA.of(productos.getCategoria())),
                Click.on(PRODUCTO.of(productos.getNombre())),
                Enter.theValue(productos.getCantidad())
                        .into(CAMPO_CANTIDAD),
                Click.on(BOTON_ADD_TO_CART));

    }

    public static Agregar deLa(Productos productos) {
        return Tasks.instrumented(Agregar.class, productos);
    }
}
