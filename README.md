#Isauro Trinidad Cynthia

Practica: Extensión de Práctica 04 - Manejo de archivos, polimorfismo y genéricos.

RESPUESTAS A LAS PREGUNTAS 

1) ¿Por qué elegí esta opción?
Elegí la opción 3 (Genéricos) porque permite reutilizar la misma implementación de ManejadorLista para diferentes tipos de objetos sin perder seguridad de tipos en tiempo de compilación.

2) De las tres opciones, ¿cuál brinda mayor escalabilidad y por qué?
La opción 3 ya que la misma clase maneja cualquier tipo T sin reescribir código, además evita casts peligrosos y facilita integrar nuevos tipos sin cambiar la interfaz ni el manejador.

3) ¿Cuáles son las principales ventajas de la opción que seleccioné?
Reutilización de código, seguridad de tipos en tiempo de compilación, mantenimiento más fácil, claridad de la API

4) ¿Qué desventajas o limitaciones identifico en la opción implementada?
Para operaciones genéricas que requieren acceso a métodos concretos, uso reflexión en la implementación actual, lo cual puede afectar rendimiento y ocultar errores en tiempo de compilación. Si quiero evitar reflexión, necesito definir una interfaz común y restringir el genérico. Eso implicaría cambiar más clases.

