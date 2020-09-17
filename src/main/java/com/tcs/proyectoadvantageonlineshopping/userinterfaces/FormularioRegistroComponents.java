package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioRegistroComponents {

    public static final Target CAMPO_USERNAME = Target
            .the("Campo Usuario")
            .located(By.name("usernameRegisterPage"));

    public static final Target CAMPO_EMAIL = Target
            .the("Campo Email")
            .located(By.name("emailRegisterPage"));

    public static final Target CAMPO_PASSWORD = Target
            .the("Campo Password")
            .located(By.name("passwordRegisterPage"));

    public static final Target CAMPO_CONFIRMAR_PASSWORD = Target
            .the("Campo Confirmar Password")
            .located(By.name("confirm_passwordRegisterPage"));

    public static final Target CAMPO_FIRST_NAME = Target
            .the("Campo Primer Nombre")
            .located(By.name("first_nameRegisterPage"));

    public static final Target CAMPO_LAST_NAME = Target
            .the("Campo Apellido")
            .located(By.name("last_nameRegisterPage"));

    public static final Target CAMPO_PHONE_NUMBER = Target
            .the("Campo Numero de Telefono")
            .located(By.name("phone_numberRegisterPage"));

    public static final Target CAMPO_COUNTRY = Target
            .the("Campo Pais")
            .located(By.name("countryListboxRegisterPage"));

    public static final Target CAMPO_CITY = Target
            .the("Campo Ciudad")
            .located(By.name("cityRegisterPage"));

    public static final Target CAMPO_ADDRESS = Target
            .the("Campo direccion")
            .located(By.name("addressRegisterPage"));

    public static final Target CAMPO_PROVINCE = Target
            .the("Campo Departamento")
            .located(By.name("state_/_province_/_regionRegisterPage"));

    public static final Target CAMPO_POSTAL_CODE = Target
            .the("Campo Codigo Postal")
            .located(By.name("postal_codeRegisterPage"));

    public static final Target CHECKBOX_I_AGREE = Target
            .the("Aceptar las Condiciones de Privacidad")
            .located(By.name("i_agree"));

    public static final Target BTN_REGISTER = Target
            .the("Aceptar las Condiciones de Privacidad")
            .located(By.id("register_btnundefined"));

}
