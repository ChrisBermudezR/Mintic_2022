# -*- coding: utf-8 -*-
"""20220428.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1BJgmuKr9c4ZBgPRaJkIZGsu06rvTkPlH

1.	Haga un programa que calcule el valor de un computador sabiendo que tienen un precio de venta y se hace un descuento dependiendo de la forma de pago, si es efectivo se le descuenta 30% del valor venta, si es con tarjeta crédito se le descuenta 15% del valor venta y si es con tarjeta debito se le descuenta un 25% del valor venta
"""

def f(valor, pago):
  if pago == 1:
    return print(f'El precio del computador es: {valor-(valor*0.3)}')
  elif pago == 2:
    return print(f'El precio del computador es: {valor-(valor*0.15)}')
  elif pago == 3:
      return print(f'El precio del computador es: {valor-(valor*0.25)}')
  else:
      return print("No eligió correctamente su método de pago. Reinicie su consulta.")

pago=int(input("Si su pago es en efectivo digite 1, si es con tarjeta de crédito digite 2 y si es con tarjeta débito digite 3 "))
valor=float(input("Digite el precio del computador: "))
f(valor, pago)

# Algoritmo propuesto por Cindy Daniela Moreno Riveros

def f(v,p):
  ef= (v*70//100)
  cre= v*85//100
  deb=v*75//100

  if p == 'efectivo':
   return print(f"\n El descuento por pago en efectivo es: {ef}")
  elif p=='credito':
   return print(f"\n El descuento por pago en T, credito es: {cre}")
  elif p=='debito':
   return print(f"\n El descuento por pago en T, debito es: {deb}")
  else:
   return print(f"\n Forma de pago incorrecta")

v=float(input("Ingrese el valor del computador:"))
p=str(input("Ingrese la forma de pago:"))
f(v,p)


#subido por Carlos Mario Gutiérrez Montoya

def metodo_pago(p,v):   
    
  if p==1:
    v1= v-((v*30)/100)
    return (print(f'el valor a pagar es: {v1}'))
  elif p==(2):
    v2= v-((v*15)/100)
    return  (print(f'el valor a pagar es: {v2}'))
  elif p==(3):
    v3= v-((v*20)/100)
    return (print(f'el valor a pagar es: {v3}'))
  else :
    return print('no es un valor valido')

v=int(input('ingrese el valor del computador: '))
p=int(input('Ingrese metodo de pago: \n si es efectivo digite 1 \n Tarjeta de Credito digite 2 \n Tarjeta De'))



#Alternativa al anterior propuesta por Cindy Daniela Moreno Riveros
def f(v,p):
  ef= (v*70//100)
  cre= v*85//100
  deb=v*75//100

  if p == 'efectivo':
   return print(f"\n El descuento por pago en efectivo es: {ef}")
  elif p=='credito':
   return print(f"\n El descuento por pago en T, credito es: {cre}")
  elif p=='debito':
   return print(f"\n El descuento por pago en T, debito es: {deb}")
v=float(input("Ingrese el valor del computador:"))
p=str(input("Ingrese la forma de pago:"))
f(v,p)
#Este algooritmo no tiene una alternativa al error de digitación

"""2.	Haga un programa que dados tres números diga cual es el mayor."""

def f(x,y,z):
  if x == y and x == z and z == y:
    return print("Todos los números son iguales")
  elif x > y and x > z :
    return print(f'{x} es el mayor de todos los números')
  elif y > x and y > z :
    return print(f'{y} es el mayor de todos los números')
  elif z > x and z > y :
    return print(f'{z} es el mayor de todos los números')
  else:
    return print("Hay dos números que son mayores que uno de los números")

x=float(input("Ingrese un número:"))
y=float(input("Ingrese otro número:"))
z=float(input("Ingrese el último número:"))
f(x,y,z)



#Alternativa propuesta por Claudia Liliana Medina Tovar

a= int(input("ingrese numero 1"))
b=int(input("ingrese numero 2"))
c=int(input("ingrese numero 3"))
if a>b and a>c:
  print ("el numero mayor es", a)
elif b>a and b>c:
  print ("el numero mayor es", b)
elif c>a and c>b:
  print ("el numero mayor es", c)

"""Subido por Cristian Herney Torres Hernandez"""

#Subido por Cristian Herney Torres Hernandez

def mayorQue(a,b,c):
  if a>=b>=c:
    return print(f" {a} es mayor que {b} y {c}")
  elif b>=a>=c:
    return print(f" {b} es mayor que {a} y {c}")
  elif c>=b>=a:
    return print(f" {c} es mayor que {a} y {b}")
  elif a == b == c: 
    return print("son iguales ")
a = int(input("primer numero : "))
b = int(input("segundo numero : "))
c = int(input("Tercero numero : "))
mayorQue(a,b,c)

"""3.	Haga un programa que calcule el salario neto de un empleado sabiendo que el salario básico de él se calcula de acuerdo con número de horas trabajadas y la hora tiene un valor especifico, además si ese salario es menor que dos salarios mínimos legales vigente (smlv) se le paga un subsidio de transporte equivalente a 55000.  (el smlv=565000)."""

def f(valorHora, horas):
  basico=valorHora*horas
  if basico < 2*565000:
    return print(f'El sueldo básico del empleado será de {basico} y del sueldo neto será de {basico + 55000} con subsidio de transporte.')
  else:
    return print(f'el sueldo neto del empleado será de {basico} sin subsidio de transporte.')
valorHora=float(input("¿Cuál es el valor de la hora?: "))
horas=float(input("¿Cuántas horas trabajó el empleado?: "))
f(valorHora, horas)



#Subido por Carlos Mario Vargas Penagos

def metodo_pago(p,v):   
    
  if p==1:
    v1= v-((v*30)/100)
    return (print(f'el valor a pagar es: {v1}'))
  elif p==(2):
    v2= v-((v*15)/100)
    return  (print(f'el valor a pagar es: {v2}'))
  elif p==(3):
    v3= v-((v*20)/100)
    return (print(f'el valor a pagar es: {v3}'))
  else :
    return print('no es un valor valido¡¡')

v=int(input('ingrese el valor del computador: '))
p=int(input('Ingrese metodo de pago: \n si es efectivo digite 1 \n Tarjeta de Credito digite 2 \n Tarjeta Debito digite 3'))

metodo_pago(p,v)