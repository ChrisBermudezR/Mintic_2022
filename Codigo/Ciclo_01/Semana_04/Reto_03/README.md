# Reto 03 - Casa Disquera

Universal Music Group (UMG) ya están en Colombia, y su último lanzamiento ha sido todo un éxito. Sin embargo, se les está haciendo un poco predecible y repetitivo, así que deciden consultar a Cliff Newsted y a Lars Trujillo por alguna idea innovadora para sacar la versión Remix. Éstos deciden sentarse a estudiar escalas y entrenar el oído musical, y se les ocurre una variación para hacerlo más entretenido.

La dinámica del nuevo componente es la siguiente: en el juego van a sonar una serie de cuerdas, una cuerda a la vez, y cada cuerda asociada a una letra distinta del alfabeto; lamentablemente, el sonido algunas veces no suena con calidad perfecta, así que el sonido de la cuerda puede llegar representado por la letra del alfabeto en minúscula o en mayúscula. La idea es que la persona luego de escuchar la sucesión de sonidos, determine en primera instancia cuál cuerda sonó y cuántas veces sono la misma cuerda de manera consecutiva.

Un ejemplo sencillo de ésta dinámica se puede hacer con la canción “Master of Python”, que inicia con la secuencia: E,E,e,E,E,d,E,E,D,c,C. En este caso, los sonidos inferidos serán E (con cinco repeticiones), D (con una repetición), E (con dos repeticiones), D (con una repetición), y C (con dos repeticiones).

Como usted cumple ahora dos roles, "jalacables" y programador, decide construir un programa que resuelve la extensión propuesta. En este caso, usted va a hacer un programa que recibe la sucesión de cuerdas que está escuchando (y adivinando) el jugador, que puede estar en minúscula o en mayúscula, y cada sonido separado por coma. La salida debe ser en primera instancia la sucesión de cuerdas, representadas en mayúscula, sin tener en cuenta los sonidos repetidos, y debajo de cada cuerda, la cantidad de veces que sonó esta de manera consecutiva.


Entrada

La entrada consta de una sucesión de caracteres separados por coma que corresponden a las cuerdas asociadas a los sonidos.

Salida

La salida consta de dos líneas: la primera es la sucesión de sonidos de cuerdas sin repeticiones, en mayúscula y separadas por espacio; la segunda es la cantidad de veces que se repitió cada sonido de cuerda de manera consecutiva, separado también por espacio.


| Entrada|Salida |
|:-:|:-:|
|E,E,e,E,E,d,E,E,D,c,C,E,E,B,E,E,a,E,A,E,g,E,G,E,f,E |E D E D C E B E A E A E G E G E F E  |
| |5 1 2 1 2 2 1 2 1 1 1 1 1 1 1 1 1 1 |

Respuesta al reto
```python
caracteres = str(input("Ingrese las letras separadas por coma: "))
mayusculas=caracteres.upper()
mayusculas=mayusculas.split(",")
a = 1
caracteres_finales = ""
numeros_finales = ""
for x in range(1,len(mayusculas)):
    if (mayusculas[x-1]==mayusculas[x]):
        a += 1
    else:
        caracteres_finales += mayusculas[x-1] + " "
        numeros_finales += str (a) + " "
        a = 1
print(caracteres_finales, end="")
print(mayusculas[x])
print(numeros_finales, end="")
print(a)

```