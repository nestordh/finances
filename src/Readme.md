Llamar la clase principal ExpenseTrackerApp, que servirá como punto de entrada
de la aplicación.

Definir las clases Expense, Category y User, asegurándose de utilizar conceptos
de POO como herencia, encapsulación y polimorfismo.

La clase Expense debe tener propiedades como amount, date, category y description.
La clase Category debe tener propiedades como name y description.

La clase User debe tener propiedades como name, email y un arreglo de expenses.
Implementar métodos básicos en estas clases para agregar, modificar y eliminar
gastos.

Crear métodos como addExpense(), removeExpense() y updateExpense() en la clase User.

Implementar manejo de excepciones para gestionar errores comunes, como intentos
de acceso a elementos inexistentes en la lista.

Crear excepciones personalizadas como ExpenseNotFoundException.
Utilizar bloques try-catch para manejar estas excepciones en métodos como
removeExpense() y updateExpense().

Crear un contador para manejar un identificador único para cada gasto. Esto nos
permitirá asignar a cada gasto un ID incremental generado por el contador,
lo cual será útil para llevar un seguimiento ordenado de nuestros gastos y
facilitar su gestión.

Realizar la manipulación de cadenas de texto, específicamente en las categorías
de nuestros gastos. Podemos aplicar una transformación para que todas las
categorías sean almacenadas en minúsculas, independientemente de cómo fueron
escritas originalmente.
Esto nos ayudará a tener uniformidad en nuestros datos y simplificará las
operaciones de búsqueda y filtrado posteriormente.

Crear al menos una excepción customizada y relanzarla en algunos puntos de
nuestra aplicación donde antes mostrábamos simplemente un error por consola.
Detectar algún punto de flujo indeseado en nuestra aplicación y capturar esa
excepción. Esto puede incluir, por ejemplo, un NumberFormatException o
IllegalArgumentException si estamos pasando un tipo de dato erróneo,
o un NullPointerException si un valor se pasa como nulo y estamos tratando
de manipularlo para hacer algo


Tips

1 Aplicar principios de POO adecuadamente: Asegúrate de utilizar herencia,
encapsulación y polimorfismo en la definición de clases y métodos.
2 Utilizar modificadores de acceso: (public, private) para encapsular los datos correctamente.
3 Documentar el código: con comentarios claros para facilitar su comprensión.
4 Mantener una estructura de paquetes organizada: para una mejor mantenibilidad.

