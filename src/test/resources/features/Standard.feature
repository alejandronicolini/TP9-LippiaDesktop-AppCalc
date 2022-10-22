@Demo
Feature: As a potential client i need to open a calculator and do math operations

  Scenario Outline: Operacion: "<operacion>"
    When ingresa un valor "<num1>"
    And clic en la el boton de la operacion: "<operacion>"
    And ingresa un valor "<num2>"
    Then el resultado es: "<resultado>"

    @Suma
    Examples:
      | operacion | num1 | num2 | resultado |
      | Sumar     | 10,5 | 20   | 30,5      |

    @Resta
    Examples:
      | operacion | num1 | num2 | resultado |
      | Restar    | 50   | 5    | 45        |

    @Multiplicacion
    Examples:
      | operacion   | num1 | num2 | resultado |
      | Multiplicar | 5,5  | 5    | 27,5      |

    @Division
    Examples:
      | operacion | num1 | num2 | resultado                      |
      | Dividir   | 20   | 4    | 5                              |
      | Dividir   | 20   | 0    | No se puede dividir entre cero |

















