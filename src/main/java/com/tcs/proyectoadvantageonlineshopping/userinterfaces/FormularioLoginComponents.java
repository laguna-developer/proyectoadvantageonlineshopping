package com.tcs.proyectoadvantageonlineshopping.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioLoginComponents {
    public static final Target CAMPO_USERNAME_LOGIN = Target
            .the("Campo nombre de usuario")
            .located(By.name("username"));

    public static final Target CAMPO_PASSWORD_LIGIN = Target
            .the("Campo Password")
            .located(By.name("password"));

    public static final Target BTN_SIGN_IN = Target
            .the("Boton Registro ").
                    located(By.id("sign_in_btnundefined"));
}
