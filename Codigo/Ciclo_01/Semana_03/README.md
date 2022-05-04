# Arreglos de datos

## Listas

Una lista en Python es una estructura de datos formada por una secuencia ordenada de objetos. Los elementos de una lista pueden accederse mediante su índice, siendo 0 el índice del primer elemento. 

```json
nombres=["Juan", "Pedro", "Maria", "Duverli", "Bryan", "Esniver", "Usnavy", "Dualinquer"]
print(nombres)
print(nombres[0])
```

## Función len() en una lista
La función len() devuelve la longitud de la lista (su cantidad de elementos).

```json

list1=["juan","pedro","cesar","augusto"]
len(list1)
```
## Concatenar listas

Se concatenan las listas usando el símbolo +

```json
nombres=["Juan", "Pedro", "Maria", "Duverli", "Bryan", "Esniver", "Usnavy", "Dualinquer"]
apellidos=["Birbiquí", "Sampues", "Chuchimí", "Caderín", "Pasto", "Pernir", "Adujú", "Bermí"]
concatenada_Nombres_Apellidos= nombres + apellidos

print(concatenada_Nombres_Apellidos)

['Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer', 'Birbiquí', 'Sampues', 'Chuchimí', 'Caderín', 'Pasto', 'Pernir', 'Adujú', 'Bermí']
```

## Agregar elementos a una lista

Se puede agregar un elemento nuevo a una lista con el símbolo + y agregando el nuevo elemneto en [ ] o con *.append* o con *.insert*. Este último comando permite insertar en cierta posición

```json
lista2=[3, 4, 5, 6, 7, 8, 9, 10 ,11, 12]
#Agregar el número 13 sin volver a hacer la lista

lista2= lista2 + [13]
print(lista2)

# otra forma que se puede agregar un elemento a la lista con .append

lista2.append(13)
print(lista2)

# otra forma es con la función .insert a la cual se le puede dar la posición en la lista con .insert(posición, elemento)
lista2.insert(3, 13)
print(lista2)

```



# Estructuras cíclicas

En esta semana se trataron las estructuras cíclicas.

Las estructuras cíclicas nos permiten repetir o iterar un conjunto de instrucciones.

Existen dos tipos de ciclos en python:

## Ciclo *while*

* Ciclo *Mientras* que en lenguaje de Python se escribe *while*:

Estructura:

Mientras *Condición*:
        Cuerpo del ciclo
Fin_Mientras


Esta estructura se puede entender como: *Mientras se cumpla con la condición verdadera, entonces se ejecutará el cuerpo del ciclo*.



```json
n=0
while i < 10
    print(i)
    i = i + 1
```

## Ciclo *for*

* Ciclo *Para* que en lenguaje de Python se escribe *for*:

Estructura:

Para *Var* = *inicio* hasta *final* Paso *Valor*.
    Cuerpo del ciclo
Fin_Para

Esta estructura se puede entender como: **Var* representa una variable que va a tomar valores iniciando en *inicio* y finalizando en *final* avanzando con un Paso de *Valor**.

```json

nums = [4, 78, 9, 84]
for n in nums:
    print(n)
``` 
