# Reto 05 - Colección de Figuritas 


Una importante empresa de productos de comidas rápidas está desarrollando una aplicación para facilitar que sus clientes intercambien figuritas de objetos animados que dan por la compra de un combo infantil. Las figuritas se organizan por categoría según el tipo de figurita como accion, magia, animal, batalla y dios, la única restricción que pedirá la aplicación es que solo se pueden intercambiar por figuritas del mismo tipo.

Lo han contratado a usted y su función es desarrollar una librería llamada “figuritas” que permita realizar las siguientes funciones: 

**1.** (Vale 1) La función "tipodefigurita" que dada una lista de los tipos de figurita(en la posición i-ésima de la lista está el tipo de dicho figurita), genera una lista con los tipos de figuritas sin repetición.

Por ejemplo si el álbum tiene diez figuritas y cada una tiene los siguientes tipos:
```python
['accion','magia','batalla','batalla','batalla','accion','magia','batalla','batalla','batalla']
```

la función debe retornar la lista

```python
['accion','magia','batalla']
```

Nótese que las clases aparecen solo una vez. 

**2.** (Vale 1) La función "mefaltandeltipodefigurita " que dada una lista con los números de figuritas que les faltan, la lista de los tipos de cada figurita y un tipo de figurita (en ese orden), les retorne una lista con los números de dicha clase que les faltan.

Por ejemplo si se ejecuta la función:

```python
mefaltandeltipodefigurita([3,6,8],['accion','magia','batalla','batalla','batalla','accion','magia','batalla','batalla','batalla'],'batalla')
```

debe retornar la lista

```python
[3,8]
```

Nótese que los números de figuritas empiezan en cero (0) y van hasta el nueve (9) en este ejemplo (siempre empiezan en cero).

Por ejemplo si ejecutan la

función:

```python
mefaltandeltipodefigurita([1,3,6,8],['accion','magia','batalla','batalla','batalla','accion','magia','batalla','batalla','batalla'],'magia')  
```

Se debe retornar la lista:

```python
[1,6] 
```

**3.** (Vale 1) La función "notengo" que dada una lista con las figuritas que tiene otra persona y una lista con las figuritas que tengo retorna la lista con las figuritas que me interesan de la otra persona.

Por ejemplo si se llama:

```python
notengo([3,5,7,10,15,16],[4,10,5,8])
```
Se debe retornar la lista:

```python
[3,7,15,16] 
```

**4.** (Vale 1) Para simplificar la primera versión de la librería decidieron pensar que todas las figuritas son de un mismo tipo y que la lista que maneja cada persona indica los números de las figuritas que tienen para cambiar y aquellos números que no están en dicha lista son los que necesitan. De esta manera deben crear una función "puedocambiar" que reciba la lista de figuritas que tiene otra persona y la lista de figuritas que tienen ellos y que retorne el número de figuritas que pueden cambiar.

Por ejemplo, llamar la función:

```python
puedocambiar([3,5,7,10,15,16],[4,10,5,8])
```
Debe retornar

```python
2
```

Porque a la otra persona solo le interesan dos figuritas que tienen ellos: ```[4,8]```, mientras que a ellos les interesan cuatro figuritas que la otra persona tiene: ```[3,7,15,16]```

**Entrada:**

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre figuritas.py y que se respeten los nombres de las funciones dadas y sus parámetros.

Respuesta al reto

```python

def tipodefigurita(a):
  vacia=[]
  for i in a:
    if i not in vacia:
      vacia.append(i)
  return vacia

def mefaltandeltipodefigurita(a,b,c):
  vacia=[]
  for i in a:
    if b[i] == c:
      vacia.append(i)
  return vacia
  
def notengo(a,b):
  vacia=[]
  for i in a:
    if (i not in b) and (i not in vacia):
      vacia.append(i)
  return vacia

def puedocambiar(a,b):
  cuenta=0
  vacia=[]
  for i in a:
    if (i in b) and (i not in vacia):
      cuenta += 1
  return cuenta
  
"""" 
esta alternativa me cuenta cuantas no tiene

def cuantasfaltan(a,b):
  cuenta=0
  cuenta =len(notengo(a,b))
  cuenta_Op =len(notengo(a,b))
  if cuenta > cuenta_Op:
    cuenta = cuenta_Op
  return cuenta
"""

```

Validación en replit:[https://replit.com/@chrisbermudezr/Reto05#main.py](https://replit.com/@chrisbermudezr/Reto05#main.py)