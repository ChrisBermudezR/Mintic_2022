import json

laminas = input("Ingrese los items disponibles en la tienda: ")
codigos = (input("Ingrese los items que desea adquirir: "))
codigos = codigos.split(" ")
laminas = json.loads(laminas)

suma = 0;
laminas_compradas = ""

for i in codigos:
    if i in laminas:
        suma += laminas.get(i, 0)
        laminas_compradas += i + " "

print(suma)
print(laminas_compradas)