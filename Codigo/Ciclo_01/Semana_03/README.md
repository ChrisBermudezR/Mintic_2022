# Arreglos de datos en :snake:

## Listas

Una lista en Python es una estructura de datos formada por una secuencia ordenada de objetos. Los elementos de una lista pueden accederse mediante su índice, siendo 0 el índice del primer elemento. 

Las características de una lista en python es que los objetos están rodeados de corchetes [ ] y están separados por comas.

```python
nombres=["Juan", "Pedro", "Maria", "Duverli", "Bryan", "Esniver", "Usnavy", "Dualinquer"]
print(nombres)
>['Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer']
print(nombres[0])
>Juan 
```
Las listas pueden contener diferentes tipos de datos como números ó cadenas de texto.

Se pueden crear listas vacias a partir de asignarle a un objeto un [ ] sin ningún valor dentro.
```python
listaVacia=[]
print(listaVacia)
>[]
```
### Operaciones de secuenciación en las listas.

Las listas en :snake: son tipos de datos secuenciales, similares a las cadenas de texto y estas se puede gestionar a través de operadores de secuenciacón. 

Los operadores de secuenciación permiten conocer el orden, largo o el contenido en cierta posición de un objeto. También permiten concatenar valores o añadir valores en ciertas posiciones. 

|Operador|Código de muestra|Valor retornado|
|--|--|--|
|Tamaño|```len(nombre)```|```>8```|
|Indexación|```nombres[0]```|```>Juan```|
|Segmentación|```nombres[1:3]```|```>['Pedro', 'Maria', 'Duverli']```|
|Concatenación|```nombres + nombres```|```>['Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer','Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer']```|
|Membrasía|```'Gerargo' in nombres```|```False```|
||||


### Función len() en una lista
La función len() devuelve la longitud de la lista (su cantidad de elementos).

```python
list1=["juan","pedro","cesar","augusto"]
len(list1)
>4
```
### Concatenar listas

Se concatenan las listas usando el símbolo +

```python
nombres=["Juan", "Pedro", "Maria", "Duverli", "Bryan", "Esniver", "Usnavy", "Dualinquer"]
apellidos=["Birbiquí", "Sampues", "Chuchimí", "Caderín", "Pasto", "Pernir", "Adujú", "Bermí"]
concatenada_Nombres_Apellidos= nombres + apellidos

print(concatenada_Nombres_Apellidos)

['Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer', 'Birbiquí', 'Sampues', 'Chuchimí', 'Caderín', 'Pasto', 'Pernir', 'Adujú', 'Bermí']
```

### Agregar elementos a una lista

Se puede agregar un elemento nuevo a una lista con el símbolo + y agregando el nuevo elemneto en [ ] o con *.append* o con *.insert*. Este último comando permite insertar en cierta posición

```python
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

### Comandos para listas (Buscar)

append
insert
remove
reverse
sort
pop
extend
count
index
clear


### Función *range()* :zap:

La función *range()* permite generar listas numéricas. Este comando acepta hasta tres argumentos para generar diferentes listas.

Cuando se usa un solo argumento, el comando *range()* genera un listado numérico desde el cero como primera posición de la lista, hasta el número con que se alimente el comando.
Ej.:
```python
range(9)
>[0,1,2,3,4,5,6,7,8]
```
Al usarse un segundo argumento, se puede modificar el límite menor de la lista numérica.
Ej:

```python
range[15, 20]
>[15, 16, 17, 18, 19]
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



```python
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

```python
nums = [4, 78, 9, 84]
for n in nums:
    print(n)
``` 
