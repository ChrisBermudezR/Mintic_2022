
# Condicionales
En programación los condicionales son estructuras de código que que permiten controlar el flujo de la ejecución de un programa. 

En :snake: la estructura básica de un condicional es la siguiente:

```python
 if condicion :
            expresion
```
Este tipo de estructura nos permite arreglar el programa para que tome decisiones por nosotros, basados en los datos de entrada que proveemos y los condicionales que usamos.

## Condicionales simples.

```python
edad=int(input("Ingresa tu edad: "))

 if edad > 18:
            print("Mayor de edad")
        else:
            print("Menor de edad")
```
## Condicionales combinadas o en cascada.

```python
edad=int(input("Ingresa tu edad: "))

if edad < 18:
            print("Menor de edad")
elif 18<= edad <= 60 :
            print("Adulto Jóven")
else:
    print("Adulto Mayor")
```
## Condicionales anidadas.

```python

edad=int(input("Ingresa tu edad: "))

if edad < 100:
    if edad >= 0:
        if edad > 18:
            print("Mayor de edad")
        else:
            print("Menor de edad")
    else:
        print("Edad incorrecta. Por Favor utilice número naturales")
else:
    print("Está seguro que está vivo?")
```

## Condicionales en secuencia.
