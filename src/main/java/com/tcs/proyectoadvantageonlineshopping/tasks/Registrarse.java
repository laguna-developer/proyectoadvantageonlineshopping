package com.tcs.proyectoadvantageonlineshopping.tasks;

import com.tcs.proyectoadvantageonlineshopping.models.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.tcs.proyectoadvantageonlineshopping.userinterfaces.FormularioRegistroComponents.*;

public class Registrarse implements Task {
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String address;
    private String province;
    private String codePostal;
    private DatosRegistro datosRegistro;

    public Registrarse(String username, String email, String password, String confirmPassword, String firstName, String lastName, String phoneNumber, String country, String city, String address, String province, String codePostal) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.address = address;
        this.province = province;
        this.codePostal = codePostal;
        this.datosRegistro = datosRegistro;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(CAMPO_USERNAME),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Enter.theValue(confirmPassword).into(CAMPO_CONFIRMAR_PASSWORD),
                Enter.theValue(firstName).into(CAMPO_FIRST_NAME),
                Enter.theValue(lastName).into(CAMPO_LAST_NAME),
                Enter.theValue(phoneNumber).into(CAMPO_PHONE_NUMBER),
                // Enter.theValue(country).into(CAMPO_COUNTRY),
                SelectFromOptions.byVisibleText(country).from(CAMPO_COUNTRY),
                Enter.theValue(city).into(CAMPO_CITY),
                Enter.theValue(address).into(CAMPO_ADDRESS),
                Enter.theValue(province).into(CAMPO_PROVINCE),
                Enter.theValue(codePostal).into(CAMPO_POSTAL_CODE));

        actor.attemptsTo(Click.on(CHECKBOX_I_AGREE),
                Click.on(BTN_REGISTER));
    }

    public static Registrarse conLos(DatosRegistro datosRegistro) {
        return new Registrarse(datosRegistro.getUsername(), datosRegistro.getEmail(), datosRegistro.getPassword(),
                datosRegistro.getConfirmPassword(), datosRegistro.getFirstName(), datosRegistro.getLastName(),
                datosRegistro.getPhoneNumber(), datosRegistro.getCountry(), datosRegistro.getCity(),
                datosRegistro.getAddress(), datosRegistro.getProvince(), datosRegistro.getCodePostal());
    }
}
