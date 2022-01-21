# inditex-Jesús

# **Ejercicio 10**
### Siguiente Elemento Mayor
La estructura de datos elegida ha sido el array, ya que, debido a la naturaleza del test no es 
necesario utilizar, por ejemplo un ArrayList. Es necesario recorrer el 
array de principio a fin, sin ordenar y sin filtrar.

Se ha calculado el coste temporal para el peor de los escenarios, es decir, 
que el array este ordenado en valor decreciente, lo cual implicaría que 
sería recorrido hasta el final para cada elemento. El primer bucle
recorrerá el array n veces, siendo n la longitud del array, y el segundo
n - 1. Por tanto el coste estimado es de O(2n-1).