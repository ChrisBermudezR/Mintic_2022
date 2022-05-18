# Semana 03

Temario
- [Semana 03](#semana-03)
    - [Arreglos de datos en :snake:](#arreglos-de-datos-en-snake)
        - [Listas](#listas)
            - [Operaciones de secuenciación en las listas](#operaciones-de-secuenciación-en-las-listas)
            - [Función len() en una lista](#función-len-en-una-lista)
            - [Concatenar listas](#concatenar-listas)
            - [Agregar elementos a una lista](#agregar-elementos-a-una-lista)
            - [Comandos para listas (Buscar)](#comandos-para-listas-buscar)
            - [Función range() ⚡️](#función-range-zap)
        - [Estructuras cíclicas](#estructuras-cíclicas)
            - [Ciclo *while*](#ciclo-while)
            - [Ciclo *for*](#ciclo-for)
           


## Arreglos de datos en :snake:

### Listas

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
#### Operaciones de secuenciación en las listas.

Las listas en :snake: son tipos de datos secuenciales, similares a las cadenas de texto y estas se puede gestionar a través de operadores de secuenciacón. 

Los operadores de secuenciación permiten conocer el orden, largo o el contenido en cierta posición de un objeto. También permiten concatenar valores o añadir valores en ciertas posiciones. 

|Operador|Código de muestra|Valor retornado|
|--|--|--|
|Tamaño|```len(nombre)```|```>8```|
|Indexación|```nombres[0]```|```>Juan```|
|Segmentación|```nombres[1:3]```|```>['Pedro', 'Maria', 'Duverli']```|
|Concatenación|```nombres + nombres```|```>['Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer','Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer']```|
|Membrasía|```'Gerargo' in nombres```|```False```|



#### Función len() en una lista
La función len() devuelve la longitud de la lista (su cantidad de elementos).

```python
list1=["juan","pedro","cesar","augusto"]
len(list1)
>4
```
#### Concatenar listas

Se concatenan las listas usando el símbolo +

```python
nombres=["Juan", "Pedro", "Maria", "Duverli", "Bryan", "Esniver", "Usnavy", "Dualinquer"]
apellidos=["Birbiquí", "Sampues", "Chuchimí", "Caderín", "Pasto", "Pernir", "Adujú", "Bermí"]
concatenada_Nombres_Apellidos= nombres + apellidos

print(concatenada_Nombres_Apellidos)

['Juan', 'Pedro', 'Maria', 'Duverli', 'Bryan', 'Esniver', 'Usnavy', 'Dualinquer', 'Birbiquí', 'Sampues', 'Chuchimí', 'Caderín', 'Pasto', 'Pernir', 'Adujú', 'Bermí']
```

#### Agregar elementos a una lista

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

#### Comandos para listas (Buscar)

**.append()** - Comando para adicionar elementos a una lista.
```python
mixed = [1, 2]
mixed.append(3)
mixed
>[1, 2, 3]

mixed.append("four")
mixed
>[1, 2, 3, 'four']
```
**.insert()** - Comando para insertar un elemento a una lista en un indice específico.
```python
vocales = ['a', 'e', 'i', 'u']
vocales.insert(3, 'o')
print('List:', vocales)
>['a', 'e', 'i', 'o', 'u']
```
**.remove()** - Comando que remueve el primer elemento coincidente (el cuál pasa como un argumento) de una lista.

```python
prime_numbers = [2, 3, 5, 7, 9, 11]
prime_numbers.remove(9)
print('Updated List: ', prime_numbers)
>[2, 3, 5, 7, 11]
```
**.reverse()** - Comando para reversar el orden de la lista.

```python
prime_numbers = [2, 3, 5, 7]
prime_numbers.reverse()
print('Reversed List:', prime_numbers)
>[7, 5, 3, 2]
```
**.sort()** - Comando para organizar los elementos de una lista de manera ascendente 

```python
prime_numbers = [11, 3, 7, 5, 2]
prime_numbers.sort()
print(prime_numbers)
> [2, 3, 5, 7, 11]
```
**.pop()** - Comando para remover un elemento de una lista indicando el índice de posición.

```python
prime_numbers = [2, 3, 5, 7]
removed_element = prime_numbers.pop(2)
print('Removed Element:', removed_element)
print('Updated List:', prime_numbers)
> [2, 3, 7]

```
**.extend()** - Comando para adicionar todos los elementos de un arreglo de datos iterable (listas, tuplas, cadenas de caractéres, etc) al final de la lista.

```python
prime_numbers = [2, 3, 5]
numbers = [1, 4]
numbers.extend(prime_numbers)
print('List after extend():', numbers)
> [1, 4, 2, 3, 5]
```
**.count()** - Comando para contar elementos de una lista que se repiten, especificando el elemento deseado.

```python
numbers = [2, 3, 5, 2, 11, 2, 7]
count = numbers.count(2)
print('Count of 2:', count)
>Count of 2: 3

```
**.index()** - Comando para informar la posición en el índice de la lista de un elemento dado.

```python
animals = ['cat', 'dog', 'rabbit', 'horse']
index = animals.index('dog')
print(index)
>1
```

**.clear()** - Comando para borrar todos los elementos de una lista.

```python
prime_numbers = [2, 3, 5, 7, 9, 11]
prime_numbers.clear()
print('List after clear():', prime_numbers)
List after clear(): []
```

**.range()**  - Comando que permite generar listas numéricas. Este comando acepta hasta tres argumentos para generar diferentes listas.

Cuando se usa un solo argumento, el comando *.range()* genera un listado numérico desde el cero como primera posición de la lista, hasta el número con que se alimente el comando.

```python
range(9)
>[0,1,2,3,4,5,6,7,8]
```
Al usarse un segundo argumento, se puede modificar el límite menor de la lista numérica.

```python
range[15, 20]
>[15, 16, 17, 18, 19]
```

## Estructuras cíclicas

En esta semana se trataron las estructuras cíclicas.

Las estructuras cíclicas nos permiten repetir o iterar un conjunto de instrucciones.

Existen dos tipos de ciclos en python:

### Ciclo *while*

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

### Ciclo *for*

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
