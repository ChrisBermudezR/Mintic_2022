# Reto 02 -  Army Force Firestorm    :rage2:

Army Force Firestorm es un videojuego, este  Incluye una modalidad denominada Pixel Gun Apocalypse, en la que los usuarios se asignan aleatoriamente a uno de dos equipos y estos deben combatir a todos los del otro equipo hasta que se termina el tiempo asignado. 

Usted se está postulando para trabajar para Army Force Firestorm y en la entrevista le piden que desarrolle una característica que consiste en lo siguiente. 
Considere dos equipos: el clan Vampiric Ghosts :ghost: y el clan Frenzy Shooters :gun:. Solamente un jugador de determinado equipo se enfrenta contra cualquier otro jugador del equipo contrario. Sin embargo, todas las armas están desalineadas, y lo único que se puede hacer es disparar hacia arriba esperando contar con suerte para infligir daño sobre el rival. 

Cada tipo de arma se va a representar con uno de los siguientes caracteres simétricos: 
  .

  -

  +

  *

  T

  Y

  |

  W

  X

  M

Cada equipo escoge sus posibles armas con las que se atacará al equipo rival. El reloj del juego despliega el arma que sí va a tener efecto contra el otro en cada momento del juego. Si algún arma usada por los clanes atina exactamente con la que representa el reloj del juego, se anota un punto a dicho equipo y se debe informar el progreso de la puntuación. 

Para representar el estado de la partida en cada momento se usa la siguiente convención: si el clan Vampiric Ghosts va ganando, se va a mostrar un 'V', si van empatados un '≈' (ASCII 247 en UTF-8), y si va ganando el Frenzy Shooters, se muestra un 'F'.

**Desarrolle un programa que permita recibir las letras que representan las armas elegidas por cada clan, que reciba la información de las vulnerabilidades a las armas dadas por el reloj del juego, y que imprima en pantalla el estado del juego en cada momento del tiempo**. 

:ghost: vs :gun:.

+XMY*|

+XWY.-

WWX.-.+M-M||+..+XM|XM


Salida

FFFFFFFFFFFFFFFFFFFFF

Entradas

+Y.X-|

WMT*|-

|*Y+-*|-|Y-X|+|YM-*T+-X-**W-XY


Salida

≈F≈VV≈≈≈≈VVVVVVVVVVVVVVVVV≈≈VV

 

Entradas

MX.+T

+TX-W

M-+.|M*++*Y-W+|M-|YXW.


Salida

V≈≈VVVVVVVVV≈≈≈V≈≈≈≈F≈

 

Entradas

*W+|.

-+TXY

XW*|M+T*YXW+X*.+MW*|


Salida

F≈VVVVVVV≈VV≈VVVVVVV

# Respuesta al reto


```python
VG=str(input("Inserta el arma del equipo Vampiric Ghosts: "))   
FS=str(input("Inserta el arma del Frenzy Shooters: "))
reloj =str(input("El juez decide que la mejor arma es: "))

VG_Armas=list(VG)
FS_Armas=list(FS)
reloj_Set=list(reloj)
#Inicializa acumuladores de puntaje para cada equipo
Puntos_VG=0
Puntos_FS=0

for i in reloj_Set:
    if(i in FS_Armas):
          Puntos_FS += 1
    if(i in VG_Armas):
          Puntos_VG += 1
    if(Puntos_VG>Puntos_FS):
        print("V",end="")
    elif (Puntos_FS>Puntos_VG):
        print("F",end="")
    else:
        print("≈",end="")

```