# Semana 01

Temario
- [Semana 01](#semana-01)
  - [Problemas](#problemas)
  - [Algoritmos](#algoritmos)
    - [¿Qué es un algoritmo?](#qué-es-un-algoritmo)
  - [Metodología para solución de problemas por medio de algoritmos](#metodología-para-solución-de-problemas-por-medio-de-algoritmos)
  - [Programación en :snake:](#programación-en-snake)
  - [Introducción a las herramientas web para desarrollo: COLAB y replit](#introducción-a-las-herramientas-web-para-desarrollo-colab-y-replit)
    - [Colab (https://colab.research.google.com/)](#colab-httpscolabresearchgooglecom)
    - [replit (https://replit.com)](#replit-httpsreplitcom)
  - [Tipos de datos en :snake:](#tipos-de-datos-en-snake)
    - [Numéricos: Enteros y reales](#numéricos-enteros-y-reales)
      - [Enteros](#enteros)
      - [Reales](#reales)
    - [Booleanos](#booleanos)
    - [Caracteres y cadenas de caracteres](#caracteres-y-cadenas-de-caracteres)
  - [Operadores](#operadores)
    - [Operadores ariméticos](#operadores-ariméticos)
    - [Operadores de asignación](#operadores-de-asignación)
    - [Operadores lógicos](#operadores-lógicos)
    - [Operadores de igualdad y relacionales](#operadores-de-igualdad-y-relacionales)
    - [Precedencia de los operadores](#precedencia-de-los-operadores)

## Problemas
Se tiene un problema cuando se desea encontrar uno o varios objetos desconocidos (ya sean estos números, símbolos, diagramas, figuras u otras  
entidades), que cumplen condiciones o relaciones, previamente definidas,
respecto a uno o varios objetos conocidos o desconocidos.

Existen cinco tipos de problemas:

1. **Bien Condicionados:** Un problema se dice bien condicionado si a partir de 
la entrada (no sobran ni faltan objetos conocidos) y a partir 
de la descripción de la relación (algunas veces llamada 
condición) entre la entrada y la salida se puede encontrar  
dicha salida.
2. **Mal Condicionados:** Son problemas en los cuales no se cuenta con la
información necesaria para resolver el problema, o la 
respuesta está sujeta a una elección personal de cada ser 
humano (que depende de los sentimientos, emociones, 
cultura, religión, política, tradición, etc.).
3. **Computables:** Son problemas para los cuales existe una secuencia finita de pasos “bien definidos” que permiten describir la relación  entre 
entrada y salida, y que al ser aplicados a la entrada  terminan 
en algu´n momento produciendo la salida.
4. **Tratables:** Son problemas para los cuales los recursos (tiempo y  
espacio) que se necesitan para su solución son finitos y no  
crecen exponencialmente a medida que aumenta el tamaño 
de la entrada.
5. **Solucionable:** Son problemas para los cuales existe una salida valida (se puede encontrar) para la entrada dada. Los problemas no 
solucionables son aquellos para los que se tienen claro tanto  la entrada como la relación entre la entrada y la salida pero  no es posible encontrar dicha salida.


## Algoritmos

### ¿Qué es un algoritmo?

Secuencia finita de tareas bien definidas, cada una de las cuales se puede realizar con una cantidad finita pero no limitada de recursos.

## Metodología para solución de problemas por medio de algoritmos

Dado un problema, para encontrar la solución a dicho problema se puede 
pensar en utilizar una metodología general que se aplique sistemáticamente de tal manera que como resultado se obtenga la
solución  del problema, así como se muestra en el siguiente diagrama.

## Programación en :snake:

Según [Wikipedia](https://es.wikipedia.org/wiki/Python) "*Python es un lenguaje de alto nivel de programación interpretado cuya filosofía hace hincapié en la legibilidad de su código, se utiliza para desarrollar aplicaciones de todo tipo, ejemplos: Instagram, Netflix, Panda 3D, entre otros. 
Se trata de un lenguaje de programación multiparadigma, ya que soporta parcialmente la orientación a objetos, programación imperativa y, en menor medida, programación funcional. Es un lenguaje interpretado, dinámico y multiplataforma.*"

<center>

![your image caption](python.png)

</center>

## Introducción a las herramientas web para desarrollo: COLAB y replit

### Colab ([https://colab.research.google.com/](https://colab.research.google.com/))

Según *Google*, *"Colaboratory, o "Colab" para abreviar, es un producto de Google Research. Permite a cualquier usuario escribir y ejecutar código arbitrario de :snake: en el navegador. Es especialmente adecuado para tareas de aprendizaje automático, análisis de datos y educación. Desde un punto de vista más técnico, Colab es un servicio de cuaderno alojado de Jupyter que no requiere configuración y que ofrece acceso sin coste adicional a recursos informáticos, como GPUs."* 

### replit ([https://replit.com](https://replit.com))

Según [Wikipedia](https://es.wikipedia.org/wiki/Replit), *"Replit (rep-lit) anteriormente repl.it es un IDE online (Entorno de desarrollo integrado) Su nombre proviene del acrónimo REPL, que significa "bucle de lectura-evaluación-impresión". Amjad Masad, Faris Masad y Haya Odeh cofundaron la empresa en 2016."*

*"Sus principales caracteristicas son que Replit permite a los usuarios escribir código y crear aplicaciones y sitios web mediante un navegador.  El sitio también tiene varias funciones de colaboración, incluida la capacidad de edición multiusuario en tiempo real con una fuente de chat en vivo. Admite lenguajes de programación y marcado como Java , :snake: y HTML , lo que permite a los usuarios crear aplicaciones y sitios web, pero puede ejecutar cualquier lenguaje existente usando Nix . El sitio está integrado con GitHub , una plataforma de alojamiento de código, que proporciona una forma de importar y ejecutar proyectos desde GitHub.  Los usuarios también pueden importar proyectos desde Glitch , que brinda un servicio similar a Replit."* 


Se puede acceder directamente a la plataforma de :snake: en replit a través del enlace: [https://replit.com/languages/python3](https://replit.com/languages/python3).

## Tipos de datos en :snake:
Existen varios tipos de datos que se pueden manejar en :snake: y estos son:
### Numéricos: Enteros y reales

#### Enteros
Se codifican con una palabra ```int``` y se declara mediante la expresión ```x:int```

Ejemplo:
aquí se asignan valores a los objetos ```i, j, p``` y se declaran que son enteros con los valores asignados

```python
i: int = 0
j : int = 1
p : int = -10
```
#### Reales
Se codifican con una palabra ```float``` y se declara mediante la expresión ```x:float```

Ejemplo:
aquí se asignan valores a los objetos ```i, j, p``` y se declaran que son reales con los valores asignados

```python
i: float = 2.0
j : float = 1.6
p : float = -1.960
```
### Booleanos
Se codifican con una palabra ```bool``` y se declara mediante la expresión ```x:bool```, lo que sirve para declarar si dicha variable es ```True``` (Verdadero) ó ```False``` (Falso).

Ejemplo:
aquí se asignan valores a los objetos ```i, j, p``` y se declaran que son reales con los valores asignados

```python
i: bool = True
j : bool = False
p : bool = True
```
### Caracteres y cadenas de caracteres
Un carácter es el elemento mínimo de información usado para representar,  controlar, transmitir y visualizar datos. 

Se codifican con una palabra ```str``` y se declara mediante la expresión ```x:str```.

```python
i: str = "r"
j : str = "tonto"
p : str = "Verdadero"
```

## Operadores
Existen diversos tipos de operadores en :snake: para llevar a cabo procedimientos tanto matemáticos como de lógica.
### Operadores ariméticos
Los operadores aritméticos en :snake: son:

|Operador|Operación|
|:-:|:-:|
|+|suma|
|-|resta|
|*|multiplicación|
|/|división|
|//|división entera|
|%|residuo de división|
|**|potencia|
### Operadores de asignación
Para asignar valores a variables se pueden utilizar los siguientes
operadores  infijos.

Estos valores realizan la operación sobre el mismo objeto de la izquierda, por ejemplo:

```python
x += 2 #esto es igual que...
x = x + 2 #esto!
```

|Operador|Operación|
|:-:|:-:|
|=|asignación|
|+=|asignación suma|
|-=|asignación resta|
|*=|asignación multiplicación|
|/=|asignación división|
|//=|asignación división entera|
|%=|asignación residuo de división|
### Operadores lógicos
Los operadores lógicos permiten realizar secuencias de operaciones que tengan una lógica.

|Operador|Operación|
|:-:|:-:|
|¬|not|
|and|y|
|or|ó|
### Operadores de igualdad y relacionales

Los operadores igualdad y relacionales permiten realizar evaluar diferentes valores devolviendo datos booleanos.

|Operador|Operación|
|:-:|:-:|
|==|igualdad|
|!=|diferencia|
|>|mayor que|
|<|menor que|
|>=|mayor o igual que|
|<=|menor o igual que|

### Precedencia de los operadores
 En :snake: como en otros lenguajes de programación, existe precedencia o gerarquía entre loss signos. por lo general la palabra pnemotécnica de **PEMDAS** nos ayudará a recordar esta precedencia. Esta parabra significa, Paréntesis, Exponencia, Multiplicación, División, Adición y Sustreacción. Sin embargo, hay jerarquía tambien con operadores de igualdad, booleanos y de asignación.

|Operador|Prioridad|
|:-:|:-:|
|()|1|
|¬ -(signo) +(signo) **|2|
|* / // %|3|
|+ - |4|
|< > <= >=|5|
|== !=|6|
|and|7|
|or|8|
|= += -= *= /= //= %=|9|

