Feature: Validar metadatos asociados al documento

  Scenario: Verificar metadatos del documento cargado
    Given que un usuario está en la página de carga de documento
    When el usuario carga un documento con metadatos incluyendo título, descripción y fecha
    Then el sistema debería asociar correctamente los metadatos al documento cargado