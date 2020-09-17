package com.tcs.proyectoadvantageonlineshopping.stepdefinitions;

import com.tcs.proyectoadvantageonlineshopping.models.DatosRegistro;
import com.tcs.proyectoadvantageonlineshopping.questions.ElUsuario;
import com.tcs.proyectoadvantageonlineshopping.tasks.Registrarse;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.BannerSuperiorComponents.*;
import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.HomeComponents.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RegistroStepDefinitions {

    @Before
    public void setUpOnStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(elNavegador)));
        OnStage.theActorCalled("Nicolas Alvarino");

    }

    @Managed
    private WebDriver elNavegador;

    @Given("^que Nicolas Alvarino se encuentra en el Home de la Pagina$")
    public void queNicolasAlvarinoSeEncuentraEnElHomeDeLaPagina() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.advantageonlineshopping.com/"));
        theActorInTheSpotlight().wasAbleTo(WaitUntil.the(HOME_PAGINA, isVisible()));
        theActorInTheSpotlight().wasAbleTo(Click.on(ICON_USER));
        theActorInTheSpotlight().wasAbleTo(Click.on(CREATE_NEW_ACCOUNT));
    }

    @When("^el se registra con sus datos$")
    public void elSeRegistraConSusDatos(List<DatosRegistro> datosDeRegistro) {
        theActorInTheSpotlight().attemptsTo(Registrarse.conLos(datosDeRegistro.get(0)));

    }

    @Then("^el deberia ver el nombre del usuario: (.*)$")
    public void elDeberiaVerElNombreDelUsuario(String username) {
        // String username = theActorInTheSpotlight().recall("username");
        theActorInTheSpotlight().should(seeThat(ElUsuario.registrado(), is(equalTo(username))));
        //theActorInTheSpotlight().should(seeThat(ElUsuario.logueado(), is(equalTo(perfil))));

    }


}
