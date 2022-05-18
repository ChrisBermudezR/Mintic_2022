# Reto 01 - La Familia Pesos Pesados



Al quitarle cuatro kilos al peso de la madre  se obtiene dos veces el peso del padre y si sumamos los pesos de la madre y el padre se obtiene cinco veces el peso del hijo (todos en pesos enteros). En la familia Pesos Pesados se dice que una persona está en etapa 'uno' si está entre 0 y 20 kilos, en etapa 'dos' si está entre 21 y 40 kilos, en etapa 'tres si está entre 41 y 80 kilos y en etapa 'cuatro' si está por encima de 80 kilos. Dado el peso del padre, realizar un programa que imprima en la primera línea los pesos del Padre, Madre e Hijo separados por un solo espacio y en la segunda línea indique en qué etapa se encuentra el hijo.

 Entrada:

Un número entero que representa el peso del padre


 Salida:

En la primera línea tres números enteros separados por espacio que representan los pesos del padre, madre e hijo separados por un solo espacio. En la segunda línea se debe indicar en qué etapa se encuentra hijo escrita en letras minúsculas.
|Entrada|Salida|
|:-:|:-:|
|65 |65 134 39
||dos|         
# Solución al reto


## Pseudocodigo

```
Algoritmo Fases_Obesidad
	Definir hijo Como Real
	Definir padre Como Entero
	Definir madre Como Entero
	Escribir 'Cuál es el peso del padre en kg: '
	Leer padre
	madre <- 2*padre+4
	hijo <- (madre+padre)/5
	Escribir padre; Escribir madre; Escribir hijo
	Si hijo >= 0 y hijo <= 20 Entonces
		Escribir 'uno'
	SiNo 
		Si hijo >= 21 y hijo <= 40 Entonces
			Escribir 'dos'
		SiNo 
			Si hijo >= 41 y hijo <= 80 Entonces
				Escribir 'tres'
			SiNo 
				Si hijo > 80 Entonces
					Escribir 'cuatro'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
```
## Respuesta al reto

```python
print("Cual es el peso del padre en kg: ")
padre = int(input())
madre = int(2*padre+4)
hijo = int((madre+padre)/5)
print(padre, madre, hijo)
if hijo>=0 and hijo<=20:
		print("uno")
else:
		if hijo>=21 and hijo<=40:
			print("dos")
		else:
			if hijo>=41 and hijo<=80:
				print("tres")
			else:
				if hijo>80:
					print("cuatro")
```