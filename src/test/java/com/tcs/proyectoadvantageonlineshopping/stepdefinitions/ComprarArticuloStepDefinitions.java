package com.tcs.proyectoadvantageonlineshopping.stepdefinitions;

import com.tcs.proyectoadvantageonlineshopping.models.Credenciales;
import com.tcs.proyectoadvantageonlineshopping.models.DatosRegistro;
import com.tcs.proyectoadvantageonlineshopping.models.DatosTarjeta;
import com.tcs.proyectoadvantageonlineshopping.models.Productos;
import com.tcs.proyectoadvantageonlineshopping.questions.ElMensaje;
import com.tcs.proyectoadvantageonlineshopping.questions.ElUsuario;
import com.tcs.proyectoadvantageonlineshopping.questions.LaLista;
import com.tcs.proyectoadvantageonlineshopping.tasks.AgregarProductos;
import com.tcs.proyectoadvantageonlineshopping.tasks.Loguearse;
import com.tcs.proyectoadvantageonlineshopping.tasks.PagarProductos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.HomeComponents.HOME_PAGINA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ComprarArticuloStepDefinitions {


    @Given("^que Nicolas Alvarino se encuentra Logueado$")
    public void queNicolasAlvarinoSeEncuentraLogueado(List<Credenciales> credenciales) {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.advantageonlineshopping.com/"));
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(HOME_PAGINA, isVisible()));
        theActorInTheSpotlight().wasAbleTo(Loguearse.conLas(credenciales.get(0)));
    }

    @When("^el agrega articulos al carrito de compras$")
    public void elAgregaArticulosAlCarritoDeCompras(List<Productos> listaDeProductos) {
        theActorInTheSpotlight().attemptsTo(AgregarProductos.deLaLista(listaDeProductos));
    }

    @Then("^el deberia ver la lista de articulos comprados en la pantalla:(.*)$")
    public void elDeberiaVerlaListaDeArticulosCompradosEnLaPantallaSHOPPINGCART(String enElCarrito) {
        theActorInTheSpotlight().should(seeThat(LaLista.deProductos(), is(equalTo(enElCarrito))));
    }

    @When("^el realiza el pago online$")
    public void elRealizaElPagoOnline(List<DatosTarjeta> datosTarjeta) {
        theActorInTheSpotlight().attemptsTo(PagarProductos.conLos(datosTarjeta.get(0)));
    }

    @Then("^podra ver el detalle de:(.*)$")
    public void podraVerEldetalleDeORDERPAYMENT(String mensajePago) {
        theActorInTheSpotlight().should(seeThat(ElMensaje.mostrado(), is(equalTo(mensajePago))));
    }
}
