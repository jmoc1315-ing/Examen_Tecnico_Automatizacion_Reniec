Feature: Navegar en la web de la reniec

  Scenario: Peruanos en el Extranjero Consulados en el mundo y Lista de Consulados en el mundo
    Given Usuario esta en la web de la reniec
    When  Hace click en el link "/portal/peruanosExtranjero.htm"
    And   Despliega la opcion "CONSULADOS EN EL MUNDO"
    And   Se redirecciona al link "http://www.consulado.pe/paginas/Inicio.aspx"
    And   Hace la busqueda con la palabra "Cuenca"
    And   Regresa a la pestania de la Reniec
    Then  Revisa el titulo de la primera pestania "Peruanos en el extranjero"