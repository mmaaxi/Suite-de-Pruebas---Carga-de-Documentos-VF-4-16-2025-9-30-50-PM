Feature: Validar registro en bitácora de carga

  Scenario: Cargar un documento y revisar el registro de bitácora
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento
    Then el sistema registra la hora, usuario y estado de la carga en la bitácora