# Reto 04 - Fichas Locombia

Hugo, Paco y Luis están coleccionando las láminas Locombia Tierra Querida y encontraron una tienda donde vende algunas láminas, cada lámina es vendida a un cierto precio. Como ellos tienen una lista con los códigos de las láminas que les hacen falta, quieren saber los códigos de las láminas que pueden comprar y el precio a pagar por dicha compra. Realizar un programa que dado un diccionario (en formato JSON) que tiene las parejas código:precio de todas las láminas que tiene la tienda, y que dada la lista de códigos de láminas que les faltan a Hugo, Paco y Luis (separados por espacios), imprima el precio de las láminas que pueden comprar y los códigos  de las láminas que pueden comprar:

|Entrada|Entrada|
|-|-|
|{"t": 66, "u": 72, "d": 90, "r": 84, "j": 36, "g": 50, "s": 94, "q": 62, "f": 35}|290|
|d p h u i e t q|d u t q|

Respuesta al reto
```python
import json

laminas = input("Ingrese los items disponibles en la tienda: ")
codigos = (input("Ingrese los items que desea adquirir: "))
codigos = codigos.split(" ")
laminas = json.loads(laminas)

suma = 0;
laminas_compradas = ""

for i in codigos:
    if i in laminas:
        suma += laminas.get(i, 0)
        laminas_compradas += i + " "

print(suma)
print(laminas_compradas)

```