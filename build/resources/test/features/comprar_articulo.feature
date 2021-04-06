# language: en

Feature: Compra Articulos
  Yo Como usuario del portal web advantageonlineshopping
  Necesito ingresar a dicho portal
  Para comprar articulos de tecnologia

  Background: Nicolas se loguea en la Aplicacion
    Given que Nicolas Alvarino se encuentra Logueado
      | username  | password   |
      | nalysdiaz | Nalys@2010 |

  @agregar
  Scenario: agregar articulos al carrito de compras

    When el agrega articulos al carrito de compras
      | categoria | nombre                           | cantidad |
      | MICE      | HP USB 3 Button Optical Mouse    | 2        |
      | MICE      | HP Z4000 Wireless Mouse          | 3        |
      | MICE      | Kensington Orbit 72352 Trackball | 2        |
    Then el deberia ver la lista de articulos comprados en la pantalla:SHOPPING CART

  @pago
  Scenario: pagar articulos
    When el realiza el pago online
      | cartNumber   | cvvNumber | mmExpiration | yyExpiration | cardholder   |
      | 987654321023 | 345       | 12           | 2025         | Nalys Nicoll |
    Then podra ver el detalle de:ORDER PAYMENT