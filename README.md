
# 🧠 **Ejercicio 2: Control de Nómina**

- ¡No todos los datos vienen como los esperamos! Valida que el sueldo sea positivo, por si acaso hay un rebelde con sueldo negativo 😅
- Usa una variable tipo `double acumuladoSueldos`, y cuando imprimas, hazle un casting a `float` solo por estética.
- **Entre `$100 y $300`** incluye ambos extremos, no los dejes por fuera como si no importaran.
- Para separar en rangos, **los operadores `>=` y `<=` son tu espada y escudo.**
- Si te dan una lista de 10 sueldos y te piden saber cuántos están en cierto rango, **no necesitas un array — un contador bien ubicado es suficiente.**

# **DOCUMENTACION EJERCICIO LOGICO**
- Primero lo que hago es crear un scanner para que el usuario me de la informacion de cuantos empleados hay para empezar a trabajar.
- despues lo que hago es pedirle al cliente que me ingrese la informacion.
- Luego cree un for para mayor facilidad de que el usuario me ingrese los sueldos de cada uno de los trabajadores.
- Despues de haber creado el for, dentro pido el sueldo del empleado y la guardo en la variable acumulado sueldos.
- Luego creo dos sumadores para que cuando entre al if y los dos else if que voy a crear pues me guarde en la varible cuantas persona entan entre ese rango.
- Luego de pedir el sueldo al usuario valido con un if que el numero ingresado no sea un negativo y el contador del for lo disminuyo y coloco la condicion continue para cuando ingrese un numero negativo el numero de empleado no aumente y continue con el ciclo volviendo a preguntar por el sueldo de ese mismo trabajador.
- Luego con un else if hago una condicion para mirar cuantos sueldos estan por fuera del rango indicado
- Luego con otro else if hago otra condicion para mirar los sueldos que estan dentro del rango indicado
- Luego por fuera del for imprimo los resultados de mi proceso, lo hago por fuera para que no me este imprimiendo cada vuelta que da el ciclo.
- Eso es todo lo que hice del ejercicio.

# **DOCUMENTACION OPTIMIZACION**
- Lo primero que hice fue que cambie s por scanner por que es una mala practica declarar variables con una sola palabra y que sea mejor entendible a la hora de leer el codigo, y hago un cambio en todo el codigo donde se utiliza scanner para que el codigo funcione.
- Luego cambio la variable a que esta guardando el nombre del producto que nos da el usuario por NombreDeProducto.
- Ahora como son 5 productos voy a crear un for para evitar utilizar tantas variables en el codigo.
- Luego dentro del for le voy a pedir ahora si el nombre del producto y el precio.
- Cambio el nombre de la variable del precio "p" por precioDelProducto
- Por la creacion del for se elimina el codigo innesesario de cada producto, donde hubo un mal uso de variables, en la linea 26 habia una mala practica que fue utilizar int para un precio ya que lo mas recomendable de utilizar es float y double.
- 
Ahora hago un cambio en la parte de los calculos, la variables que se utilizaron a simple vista no se deduciria que es lo que hace, tendria que analizar la operacion para saber que es.
Al arreglar esa parte elimino el resto por que seria codigo sobrante, ya que en el for con un solo calculo se le puede hacer a toda la compra.
Luego imprimo el total de la compra, con uno solo basta.
cambio la variable suma por un sumador, que me va a hacer el calculo de la suma de toda la compra de los productos y la coloco arriba del for.
Luego de haber simplificado todo el programa, nos queda un codigo de 67 lineas pasamos a 20 lineas solamente.
Y pues asi quedaria mi automatizacion del codigo