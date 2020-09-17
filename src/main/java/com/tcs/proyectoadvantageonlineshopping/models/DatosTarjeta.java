package com.tcs.proyectoadvantageonlineshopping.models;

public class DatosTarjeta {
    private String cartNumber;
    private int cvvNumber;
    private int mmExpiration;
    private int yyExpiration;
    private String cardholder;

    public DatosTarjeta(String cartNumber, int cvvNumber, int mmExpiration, int yyExpiration, String cardholder){
        this.cartNumber = cartNumber;
        this.cvvNumber = cvvNumber;
        this.mmExpiration = mmExpiration;
        this.yyExpiration = yyExpiration;
        this.cardholder = cardholder;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public int getMmExpiration() {
        return mmExpiration;
    }

    public int getYyExpiration() {
        return yyExpiration;
    }

    public String getCardholder() {
        return cardholder;
    }
}
