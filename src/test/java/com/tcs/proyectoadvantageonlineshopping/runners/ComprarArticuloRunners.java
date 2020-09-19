package com.tcs.proyectoadvantageonlineshopping.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/comprar_articulo.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.tcs.proyectoadvantageonlineshopping",
        tags = "")
public class ComprarArticuloRunners {
}
