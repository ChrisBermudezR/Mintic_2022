# Semana 05
Temario

- [Semana 05](#semana-05)
    - [Arreglos de datos en :snake:](#arreglos-de-datos-en-snake)
        - [Diccionarios](#diccionarios)
    - [Manejo de datos](#manejo-de-archivos)
## Arreglos de datos en :snake:.

### Diccionarios

Un **Diccionario** es un colecció de parejas clave-valor donde los valores
pueden ser recuperados principalmente por su clave. Cada pareja
```clave-valor``` clave en un diccionario es considerada un ítem o registro. En
Python, un diccionario se escribe separando los ítems por comas (,) y
entre llaves { }.

```python
Diccionario= {"Valle":"Cali", "Antioquia":"Medellín", "Nariño":"Pasto"}
```
## Manejo de archivos

Un **archivo** es una unidad lógica de almacenamiento de datos en dispositivos externos (no memoria principal). Se dice *unidad lógica* porque todos los *bytes* almacenados en un archivo se ven como una sola unidad que tiene un inicio y un fin, sin importar lo que esos bytes estén presentando.

**Texto:** Cuando cada byte representa un ASCII (en algunos casos
UTF-8 o UTF-16) como los archivos .txt; los de páginas
web .html; los de código fuente en muchos lenguajes de
programación .py, .c, .java, .cpp, .tex; los de formato
abierto para representar datos en forma de tabla como .csv.

**Binario:** Cuando cada byte representa algo diferente o requiere un
conjunto de bytes para representar algo, como los archivos
de imagen .jpg, .png, de documento .doc, .pdf, .xls,
.ods, comprimidos .rar, .zip, entre otros.

Argumeto ```t =``` abre el archivo en modo texto

Argumento ```+ =``` abre el archvo para lectura y escritura.

Programa para crear un archivo desde python:

Cree un archivo de texto con los siguieentes datos
* Nombre
* Apellido
* Peso
* Estratura
* Fecha Nacimiento
* Empresa donde trabaja
* Ciudad 
* Dpto
* Pais

```python
from io import open
archivo1= open("MisDatos.txt", "w")
texto = "Nombre: Christian\nApellido: Bermúdez Rivas\nPeso:75 kg \nEstratura:1.70 \nFecha Nacimiento:19 enero 1980 \nEmpresa donde trabaja:Dirección General Marítima \nCiudad:Tumaco \nDpto:Nariño \nPais: Colombia"
archivo1.write(texto)
archivo1.close()
 ```