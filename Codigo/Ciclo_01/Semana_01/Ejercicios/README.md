# Ejercicios

# Ejercicio 1

## Mi primer programa en :snake:

¿Cómo hacer un regueton?

En este ejercicio Don Milquiades nos va a dar la pauta para componer letras de regueton, lo cuál codificaremos y desarrollaremos una maquina de hacer letras de regueton.

|||||||
|-|-|-|-|-|-|
|Mami|Yo Quiero|Encendelte|Suave|Hasta que salga el sol|Sin anestesia|
|Bebé|Yo Puedo|Amalte|Lento|Toda la Noche|sin compromiso|
|Princess|Yo Vengo a|Ligal|lápido|Hasta el amanecel|Feis to feis|
|Mami|Voy a|Jugal|fuelte|Todo el día|Sin miedo|


```python
from IPython.display import YouTubeVideo
YouTubeVideo("6iOlB0QLy84")
```

```python
import random # se importa la librería de python random
sujetos = ["mami", "bebé", " princess" , "mami"]    # se define una lista  
intenciones = ["yo quielo" , "yo puedo", "yo vengo a" , "voy a" ]
verbos = [ "encendelte" , "amalte", " ligal " , " jugal" ] 
advs = [ "suave" , " lento" , "lápido", " fuelte" ]
complementos_uno = [ "hasta que salga el sol" , "toda la noche",  
"hasta el amanecel", "todo el día"]
complementos_dos = [ "sin anestesia" , "sin compromiso", " feis to feis" ,  
"sin miedo"]

sujeto_seleccionado = random.choice( sujetos)
# se u t i l i z a la l i br er í a 
intencion_seleccionada = random.choice(intenciones)
# para s el ec c i onar un elemento
verbo_seleccionado = random.choice(verbos)
# al azar de la l i s t a s uj et os
adv_seleccionado = random.choice(advs) 
compl1s_seleccionado = random.choice(complementos_uno)
compl2s_seleccionado = random.choice(complementos_dos)



print ( "letra generada: " + sujeto_seleccionado + " "
+ intencion_seleccionada + " " + verbo_seleccionado + " "
+ adv_seleccionado + " " + compl1s_seleccionado + " "
+ compl2s_seleccionado) # se imprime la canción
```