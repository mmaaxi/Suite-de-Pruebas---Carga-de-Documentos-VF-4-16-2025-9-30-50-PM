Feature: Validar carga de documento PDF válido

  Scenario: Carga exitosa de un PDF válido
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona el archivo PDF desde el botón 'Seleccionar Archivo'
    Then El sistema muestra una vista previa del archivo seleccionado
    When El usuario hace clic en 'Cargar documento'
    Then El documento se carga correctamente y se muestra un mensaje de éxito