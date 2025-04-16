Feature: Verificar respuesta en condiciones de red lenta

  Scenario: Simular conexión de red lenta y cargar un archivo PDF
    Given la aplicación está configurada para simular una conexión de red lenta
    When el usuario carga un archivo PDF
    Then el sistema debe mostrar un indicador de carga prolongada
    And el sistema debe completar la carga del archivo sin errores