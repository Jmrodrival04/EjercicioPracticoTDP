Este es mi repostiorio de github: https://github.com/Jmrodrival04/EjercicioPracticoTDP.git

"Ejercicio 1"
1. Definición de la Clase y el Constructor:
La clase Matriz se define con una variable miembro datos, que es una matriz bidimensional de enteros (int[][]). Esta matriz representa los datos de la matriz.

El constructor de la clase toma una matriz de enteros bidimensional como parámetro y la asigna a la variable miembro datos. Esto permite crear una instancia de Matriz con los datos proporcionados.

2. Método imprimir():
El método imprimir() recorre la matriz datos y la imprime en la consola. Utiliza dos bucles for anidados para recorrer las filas (i) y las columnas (j) de la matriz, imprimiendo cada elemento seguido de un espacio. Cuando termina de imprimir una fila, imprime un salto de línea para comenzar con la siguiente fila, resultando en la impresión de la matriz en forma tabular.

3. Método transpuesta():
El método transpuesta() calcula la transpuesta de la matriz datos y devuelve una nueva instancia de Matriz que contiene esta matriz transpuesta. La transpuesta de una matriz se obtiene al reorganizar la matriz de tal manera que las filas se convierten en columnas y viceversa.

Para calcular la transpuesta, primero se determinan las dimensiones de la matriz original (filas y columnas). Luego, se crea una nueva matriz (transpuesta) con las dimensiones invertidas (las columnas de la matriz original se convierten en las filas de la matriz transpuesta, y las filas de la original en las columnas de la transpuesta).

Después, se recorre la matriz original con dos bucles for anidados, asignando cada elemento [i][j] de la matriz original a la posición [j][i] en la matriz transpuesta. Finalmente, se devuelve una nueva instancia de Matriz que encapsula la matriz transpuesta calculada.

4. Método main() para Pruebas:
El método main es el punto de entrada del programa cuando se ejecuta. Crea una instancia de Matriz con una matriz 2x2 como ejemplo ({{1, 2}, {3, 4}}). Luego, imprime la matriz original llamando al método imprimir(), calcula la transpuesta de la matriz con el método transpuesta(), y finalmente imprime la matriz transpuesta.

"Ejercicio 2"
1. Inicio del Programa:
Cuando inicias el programa, se lanza el método main de la clase PizzaOrderSystem. Este método es el punto de entrada del programa, donde todo comienza. Primero, se muestra un mensaje de bienvenida al usuario, indicando que ha ingresado al Sistema de Gestión de Pedidos de Pizza en Línea.

2. Mostrar Menú:
A continuación, el programa entra en un bucle que muestra un menú con tres opciones:

Realizar Pedido
Listar Pedidos
Salir
Este menú se muestra repetidamente después de cada acción hasta que el usuario elija salir.

3. Seleccionar Opción:
El usuario debe seleccionar una de las opciones ingresando un número. El programa entonces lee esta entrada a través de la consola.

4. Realizar Pedido:
Si el usuario elige realizar un pedido (opción 1), se le solicita que ingrese el nombre de la pizza que desea pedir. Luego, se pide al usuario que ingrese el precio de la pizza. Esta información se utiliza para crear un detalle de pedido, incluyendo un tiempo estimado de entrega generado aleatoriamente entre 20 y 40 minutos. Este detalle se muestra al usuario y se agrega a la lista de pedidos.

5. Listar Pedidos:
Si el usuario elige listar los pedidos (opción 2), el programa recorre la lista de pedidos almacenados y los muestra en la consola. Si no hay pedidos, se informa al usuario que no hay pedidos realizados.

6. Salir del Programa:
Si el usuario elige salir (opción 3), el programa termina el bucle y muestra un mensaje de despedida, indicando que el sistema se está cerrando.

7. Bucle del Menú:
Mientras el usuario no elija salir, el menú se seguirá mostrando después de cada acción, permitiendo al usuario realizar más pedidos o listar los pedidos existentes tantas veces como desee.

En conclusión el sistema de gestión de pedidos de pizza sigue bien los principios SOLID, con cada clase cumpliendo un propósito específico (principio de responsabilidad única) y siendo flexible gracias al uso de interfaces (principios de sustitución de Liskov), lo que facilita añadir nuevas funcionalidades y cambiar componentes sin afectar el código existente. En contraste, la clase Matriz, enfocada en operaciones de matrices, tiene un diseño más simpleque no comparte todos los principios SOLID.
