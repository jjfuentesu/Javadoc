# Javadoc
A continuación se presenta un ejemplo de una única clase en Java llamada OperacionesMatematicas, la cual implementa métodos para realizar operaciones aritméticas básicas: suma, resta y multiplicación. Cada método está completamente documentado utilizando comentarios JavaDoc . Se incluye además el manejo de excepciones para demostrar cómo se puede capturar un error (por ejemplo, cuando se ingresan números negativos). Al final, se ofrece una explicación detallada que puedes pegar en el muro de una clase virtual.

La clase OperacionesMatematicas es un ejemplo práctico que ilustra el uso de JavaDoc para documentar un proyecto en Java. En este ejemplo se puede observar lo siguiente:

•	Documentación de la clase:
Se explica la finalidad de la clase, los métodos que implementa y se indican detalles adicionales como la versión y el autor. Esto facilita la comprensión del propósito de la clase para otros desarrolladores que consulten la documentación.
•	Documentación de métodos:
Cada método (como sumar, restar y multiplicar) está documentado con descripciones claras. Se utilizan las etiquetas @param para explicar los parámetros de entrada, @return para indicar lo que devuelve el método y @throws para especificar las excepciones que pueden ser lanzadas. Este nivel de detalle ayuda a quien use estos métodos a entender cómo interactuar con ellos correctamente.
•	Manejo de excepciones:
Se incluye una validación en cada método que verifica que los números ingresados sean positivos. Si se ingresa un número negativo, se lanza una excepción IllegalArgumentException con un mensaje descriptivo. Además, en el método main, se muestran ejemplos de cómo capturar y manejar estas excepciones mediante bloques try-catch. Esto ejemplifica buenas prácticas en el desarrollo de software, al asegurar que el programa pueda manejar errores de forma controlada.
•	Uso práctico en el método main:

En el método main se invocan los métodos documentados, se muestran los resultados en la consola y se demuestra el manejo de errores. Esto proporciona un ejemplo completo de cómo se puede integrar la documentación JavaDoc y las excepciones en un mismo proyecto.

Este ejemplo resulta útil para entender cómo se estructura la documentación con JavaDoc, promoviendo la creación de código legible, mantenible y bien documentado. Además, es una herramienta esencial para la colaboración y el desarrollo profesional en proyectos de 
