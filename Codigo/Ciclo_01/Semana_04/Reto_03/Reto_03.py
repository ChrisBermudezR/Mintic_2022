caracteres = str(input("Ingrese las letras separadas por coma: "))
mayusculas=caracteres.upper()
mayusculas=mayusculas.split(",")
a = 1
caracteres_finales = ""
numeros_finales = ""
for x in range(1,len(mayusculas)):
    if (mayusculas[x-1]==mayusculas[x]):
        a += 1
    else:
        caracteres_finales += mayusculas[x-1] + " "
        numeros_finales += str (a) + " "
        a = 1
print(caracteres_finales, end="")
print(mayusculas[x])
print(numeros_finales, end="")
print(a)