Feature: Prueba de seguridad en la carga de archivos

  Scenario: Intentar cargar un archivo con contenido malicioso
    Given El usuario está en la página de carga de archivos
    When El usuario intenta cargar un documento con contenido malicioso
    Then El sistema rechaza el archivo y muestra una alerta de seguridad