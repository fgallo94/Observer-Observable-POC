## Trabajo Practico 2
### Dentro de "doc" se encuentra el javadoc.

### Ciclo

1. Intanciamos los objetos Car extiende de observable y Mechanic que implementa Observer.
2. En la instancia de Car realizamos addObserver(//La instancia de Mechanic//).
3. En la instancia de Mechanic ejecutamos checkCar(), esto chequea los valores a cambiar del auto, desde aqui se llama a los setters que sean necesarios.
4. Dentro de cada setter de Car guardamos la copia del objeto antes del cambio, realizamos el cambio de valores, se avisa al Observer que el Observable cambio mediante setChanged().
5. Se notifica al observer mediante notifyObserver(//Instancia anterior al cambio de Car//), este ejecuta el metodo .update() chequea que valores fueron modificados casteando el objeto que recibe a una instancia nueva de Car, emite la salida por pantalla.

### Respuesta

El argumento enviado es una copia de la instancia anterior del objeto a modificar que realiza el setChanged(), este metodo se ejecuta al realizar el notifyObserver() en este caso solo se puede enviando la instancia previamente mencionada dado que tiene la logica para reaccionar ante el objeto de tipo Car. En caso de existir otra logica podria no enviarse un objeto.









