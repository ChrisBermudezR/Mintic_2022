# Condicionales Anidadas

edad=int(input("Ingresa tu edad: "))

if edad < 100:
    if edad >= 0:
        if edad > 18:
            print("Mayor de edad")
        else:
            print("Menor de edad")
    else:
        print("Edad incorrecta. Por Favor utilice número naturales")
else:
    print("´che qué, Matusalén o qué?")