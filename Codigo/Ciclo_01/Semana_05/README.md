# Semana 05
Temario

- [Semana 05](#semana-05)
  - [Arreglos de datos en :snake:.](#arreglos-de-datos-en-snake)
    - [Diccionarios](#diccionarios)
      - [Creación de diccionarios](#creación-de-diccionarios)
      - [Consulta de un valor en diccionarios](#consulta-de-un-valor-en-diccionarios)
      - [Agregar valores a un diccionario](#agregar-valores-a-un-diccionario)
      - [Consultas de las claves, valores y clave:valor](#consultas-de-las-claves-valores-y-clavevalor)
      - [Consulta de claves en diccionarios.](#consulta-de-claves-en-diccionarios)
  - [Manejo de archivos](#manejo-de-archivos)
## Arreglos de datos en :snake:.

### Diccionarios

Un **Diccionario** es una coleccióa de parejas clave-valor donde los valores
pueden ser recuperados principalmente por su clave. Cada pareja
```clave:valor``` en un diccionario es considerada un ítem o registro. En
Python, un diccionario se escribe separando los ítems por comas (,) y
entre llaves { }.

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
```
En este ejemplo las claves son los departamentos y el valor son las ciudades de Colombia.


#### Creación de diccionarios

Se pueden crear de dos formas:

```python
diccionario={ }
diccionario=dict()
```
El anterior código genera un diccionario vacío llamado ```diccionario```.

#### Consulta de un valor en diccionarios

Se puede acceder a un valor a través de su clave.

```python
print(ciudades["Valle"])
>"Cali"
``` 
Se pueden hacer consultas de valores a través del comando ```.get()```. Este comando se estructura como: ```nombre_diccionario.get(clave,"No existe el valor")```.

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
valor=ciudades.get("Valle", "Nop")
print(valor)
>Cali
```
#### Agregar valores a un diccionario

Se puede agregar un elemento a un diccionario a través de la siguiente estructura: ```nomDic[clave]=valor```. Si la clave no existe se agrega este nuevo elemento, por el contrario si la clave existe, se modifica el valor de dicha clave.

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
ciudades["Cauca"]="Popayan"
print(ciudades)
>{'Valle': 'Cali', 'Antioquia': 'Medellín', 'Nariño': 'Pasto', 'Cauca': 'Popayan'}
```
#### Consultas de las claves, valores y clave:valor

Se puede consultar las claves dentro de un diccionario con el comando ```.key()```.

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
print(ciudades.keys())
dict_keys(['Valle', 'Antioquia', 'Nariño'])
```
El comando ```.values()```nos devuelve el valor asociado a las claves.

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
print(ciudades.values())
dict_values(['Cali', 'Medellín', 'Pasto'])
```
El comando ```.items()```nos devuelve tanto las claves como el valor en una *Tupla*.

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
print(ciudades.items())
dict_items([('Valle', 'Cali'), ('Antioquia', 'Medellín'), ('Nariño', 'Pasto')])
```
#### Consulta de claves en diccionarios.

El comando ```in``` nos permite saber si cierto valor está dentro de un diccionario como una clave con al estructura ```clave in nombre_Diccionario```

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
print("Madrid" in ciudades)
>False
```
En los **condicionales** el comando ```in```funciona de la siguiente manera:

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
  if "Nariño" in ciudades:
    print("Verdad")
  else:
    print("Mentira")
>Verdad
```

En los **ciclos** el comando ```in``` funciona de la siguiente manera:

```python
ciudades= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
for i in ciudades:
    print(i)
>Valle
Antioquia
Nariño
```
## Manejo de archivos

Un **archivo** es una unidad lógica de almacenamiento de datos en dispositivos externos (no memoria principal). Se dice *unidad lógica* porque todos los *bytes* almacenados en un archivo se ven como una sola unidad que tiene un inicio y un fin, sin importar lo que esos bytes estén presentando.

**Texto:** Cuando cada byte representa un ASCII (en algunos casos
UTF-8 o UTF-16) como los archivos .txt; los de páginas web .html; los de código fuente en muchos lenguajes de
programación .py, .c, .java, .cpp, .tex; los de formato abierto para representar datos en forma de tabla como .csv.

**Binario:** Cuando cada byte representa algo diferente o requiere un
conjunto de bytes para representar algo, como los archivos
de imagen .jpg, .png, de documento .doc, .pdf, .xls, .ods, comprimidos .rar, .zip, entre otros.

Hay 4 operaciones que se pueden hacer con archivos:

*Crear:* El comando *open* abre un archivo en modo lectura y el comando *.write()* crea el archivo.

```python
with open("files/wdata.txt", "w") as f:
data = "estamos escribiendo en el archivo 123\n"
f.write(data)
f.write(data)
f.write(data)
```

Abrir:

Cerrar:

Eliminar: