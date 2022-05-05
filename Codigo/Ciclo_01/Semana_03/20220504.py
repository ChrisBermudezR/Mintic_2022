# -*- coding: utf-8 -*-
"""20220504.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1BQjPydKHzL2fKqg6PyDRrUBMcrcfVwkY

# Función *range()* 🛸
"""

for i in range(5):
    print(i, end=", ") # prints: 0, 1, 2, 3, 4,

for i in range(-1, 5):
 print(i, end=", ")

for i in range(-1, 5, 2): # este último elemento permite darle el tipo de incremento en impresión al ciclo
 print(i, end=", ")

"""# Palabra reservada *break* ⚡

Esta función suspende la ejecución del programa
"""

lista = ["Juan", "Pedro", "Maria", "Luisa"]
for a in lista:
  print (a)
  if a == "Maria":
    break

"""# Contador para una *string*"""

#Escribir un programa en el que se pregunte al usuario por una frase y una letra, y muestre por pantalla el número de veces que aparece la letra en la frase.
frase = input("Introduce una frase: ")
letra = input("Introduce una letra: ")
contador = 0
for i in frase:
    if i == letra:
        contador += 1
print("La letra '%s' aparece %2i veces en la frase '%s'." % (letra, contador, frase))

"""# Palabra reservada *continue*"""

for i in range(10):
  if i % 2 is 1:
    continue 
  print(i)

"""# Problemas en clase

Hacer un programa que diga si un número es primo o no.
"""

numero=int(input("Ingrese un número: "))
if numero % numero is 0 and numero % 1 is 0 and numero % 2 is 1:
  print("Este número es primo")
else:
  print("Este número no es primo")

# Cesar Augusto Valencia Carvajal

def num_primo(num):
    for n in range(2, num):
        if num % n == 0:
            print("No es primo", n, "es divisor")
            return False
    print("Es primo")
    return True

num = int(input ("Introduce una numero:"))
num_primo(num)

# César Eduardo López Cardona

numero = int(input('Ingrese un número entero positivo mayor que 2: '))
numeroprimo = True
for i in range(2, numero):
  if numero % i == 0:
    numeroprimo = False
    break
if numeroprimo: 
  print(f'El número {numero} es primo')
else: 
  print('No es un número primo')

"""Hacer un programa que me evalue si en una cadena infinita de números, el número digitado es primo o no. Solo para si se digita el 1"""



"""Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas."""

numero=int(input("Ingrese un número entero positivo: "))
for i in range(2, numero, 2):
   print(i, end=", ")

# Cesar Augusto Rodriguez Diaz

num = int(input("ingrese un numero positivo "))
for i in range(-1,num,2):
  print(i , end=""+ ",")

"""Escribir un programa que pregunte al usuario una cantidad a invertir, el interés anual y el número de años, y muestre por pantalla el capital obtenido en la inversión cada año que dura la inversión."""

inversion=float(input("Ingrese su inversion: "))
interes=float(input("Ingrese su interes deseado: "))
tiempo=float(input("Ingrese el tiempo de pago: "))
capital = tiempo*(inversion +((inversion*interes)/100))



print(capital)

"""Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10."""



"""Analizar que hace el siguiente código"""

n = int(input("Introduce un número entero positivo mayor que 2: "))
i = 2
while n % i != 0:
    i += 1
if i == n:
    print(str(n) + " es primo")
else:
    print(str(n) + " no es primo")

amount = float(input("¿Cantidad a invertir? "))
interest = float(input("¿Interés porcentual anual? "))
years = int(input("¿Años?"))
for i in range(years):
    amount *= 1 + interest / 100 
    print("Capital tras " + str(i+1) + " años: " + str(round(amount, 2)))

"""Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta."""

# este problema no pude resolverlo.

password=str(input("Indroduzca la contraseña: "))
guardada ="El_Chavo"
while password != guardada:
  print(str(input("Indroduzca la contraseña: ")))
  if (password == guardada):
    break
print("Contraseña correcta")

# Solución dada por Carlos Mario Vargas Penagos 

pssw=(input("Establezca una nueva contraseña: "))
while True:
  print("\n Por favor, inicie sesion con la misma contraseña ")
  npssw=(input("Introduzca la contraseña: "))
  if(npssw == pssw):
    break
print("\n Contraseña correcta, bienvenido")