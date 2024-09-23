Feature: flujo de compras
@Login
  Scenario Outline: comprar producto ingresando a la imagen

    Given que el cliente ha accedido a la web Swablab
    And se ha logueado con el <usuario> y <contrasena>
    When selecciona imagen del producto
    And Agrega el producto
    And selecciona el carrito de compras
    And hace clic en Checkout
    And digita <nombre>, <apellido> y <codpostal>
    And hace clic en continuar
    And hace clic en Finalizar
    Then se muestra mensaje de <compra exitosa>

    Examples:
      | usuario       | contrasena   | nombre | apellido | codpostal | compra exitosa            |  |
      | standard_user | secret_sauce | Albert | Ponte    | 051       | Thank you for your order! |  |


