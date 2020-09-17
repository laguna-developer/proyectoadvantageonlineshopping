package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BannerSuperiorComponents {
    public static final Target ICON_USER = Target
            .the("User")
            .located(By.id("menuUser"));

    public static final Target CREATE_NEW_ACCOUNT = Target
            .the("Crear Nueva Cuenta").locatedBy("//a[@class='create-new-account ng-scope']");


    public static final Target ICON_USER_REGISTRADO = Target
            .the("Usuario Registrado").located(By.id("menuUserLink"));

    public static final Target ADVANTAGE_DEMO = Target
            .the("Advantage Demo Home")
            .locatedBy("//span[text()='dvantage']");

}
