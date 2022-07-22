# Reto 01

## Buscando las esferas del dragón!

Bulma, Goku y Krilin están en búsqueda de las esferas del dragón y en su travesía han logrado determinar una técnica que les permite determinar a partir de una distancia ingresada la cual representa la distancia a la casa de Goku (Valor entero) la distancia a la próxima esfera, el tiempo de duración del viaje y el nombre de la esfera que están buscando.

El nombre de la esfera que se está buscando se determina a partir del tiempo de duración del viaje que se tiene con ella. Si el viaje está entre 0 y 20 la esfera será la uno, será la dos si está entre 21 y 30, es la tres si se encuentra entre 31 y 50. Y si el tiempo de duración del viaje es más de 50 será la esfera cuatro.

La técnica realiza cálculos muy sencillos para determinar el tiempo de duración del viaje y la distancia a la próxima esfera. Dicha técnica estable que la suma de la distancia a la casa de Goku con la distancia a la próxima esfera es igual a cinco veces el tiempo de duración del viaje a la próxima esfera. También se estimó que, al quitarle 4 a la distancia a la próxima esfera, se obtiene dos veces la distancia a la casa de Goku (todas las distancias son enteras).

Elabore un programa que permita simular la técnica utilizada por Bulma, Goku y Krilin, dada una distancia, imprima la distancia a la casa de Goku, la distancia a la próxima esfera y el tiempo de duración del viaje, separados por un espacio. Adicionalmente, el programa debe indicar en la siguiente línea, el nombre de la esfera que están buscando.

**Entrada**

La entrada es un número entero que representa la distancia a la casa de Goku.

**Salida**

Tres enteros separados por espacio que imprima la distancia a la casa de Goku, la distancia a la próxima esfera y el tiempo de duración del viaje, separados por un espacio. En la siguiente línea en letras el nombre de la esfera que están buscando.

Ejemplo
|Entrada|salida|
|-|-   |
|178|178 360 107|
|73|cuatro|
||73 150 44|
||tres|


```java
import java.util.Scanner;
public class Reto01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la distancia a la casa de Goku");
        int distanciaCasaGoku = teclado.nextInt();

        int distanciaProximaEsfera = 2 * distanciaCasaGoku + 4;
        int tiempoDuracionViaje = (distanciaCasaGoku + distanciaProximaEsfera) / 5;

        System.out.println(distanciaCasaGoku + " " + distanciaProximaEsfera + " " + tiempoDuracionViaje);

        if (tiempoDuracionViaje <= 20)
        {
            System.out.println("uno");
        } else if (tiempoDuracionViaje <= 30)
        {
            System.out.println("dos");
        } else if (tiempoDuracionViaje <= 50)
        {
            System.out.println("tres");
        } else
        {
            System.out.println("cuatro");
        }
    }
}

```
