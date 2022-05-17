#Construir un programa  que haga una rifa del 1 al 10 donde el número ganador sea 5.
numero=int()
while numero != 5:
    numero=int(input("Elija un número del 1 al 10: "))
    if 0 < numero <= 10 and numero !=5:
      print("Escoge de nuevo") 
    elif 0 <= numero > 10 :
      print("Elige un número menor que 10 y mayor que 1")
print("Ganaste") 