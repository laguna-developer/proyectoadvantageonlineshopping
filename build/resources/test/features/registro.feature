# language: en
Feature: Registro para compras online
  Yo Como usuario del portal web advantageonlineshopping
  Necesito Crear una cuenta en dicho portal
  Para realizar las compras de articulos de tecnologia

  Scenario: Registro de usuario en advantageonlineshopping
    Given que Nicolas Alvarino se encuentra en el Home de la Pagina
    When el se registra con sus datos
      | username | email             | password   | confirmPassword | firstName    | lastName      | phoneNumber | country  | city     | address            | province  | codePostal |
      | nalysdiaz    | nalys@outlook.com | Nalys@2010 | Nalys@2010      | Nalys Nicoll | Alvarino Diaz | 3457896543  | Colombia | Medellin | Calle 45C # 78-124 | Antioquia | 998877     |
    Then el deberia ver el nombre del usuario: nalysdiaz


