package com.tcs.proyectoadvantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagoComponents {

    public static final Target CART_NUMBER = Target
            .the("Numero de Tarjeta")
            .located(By.id("creditCard"));

    public static final Target CVV_NUMBER = Target
            .the("Codigo de Verificacion")
            .located(By.name("cvv_number"));

    public static final Target MM_EXPRIRED = Target
            .the("Mes de Expiracion ")
            .located(By.name("mmListbox"));

    public static final Target AA_EXPRIRED = Target
            .the("Año de Expiracion ")
            .located(By.name("yyyyListbox"));

    public static final Target CARDHOLDER_NAME = Target
            .the("Nombre del Propietario ")
            .located(By.name("cardholder_name"));

    public static final Target BTN_PAY_NOW = Target
            .the("Boton Pagar Ahora")
            .located(By.id("pay_now_btn_ManualPayment"));

    public static final Target SHOPPING_CART = Target
            .the("Pantalla Carrito de Compras")
            .locatedBy("//a[@class='select  ng-binding']");

    public static final Target ORDER_PAYMENT = Target
            .the("Pantalla Orden de Pago")
            .locatedBy("//a[@class='select ng-scope']");
}
