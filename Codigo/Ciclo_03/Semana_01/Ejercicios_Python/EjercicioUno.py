#Pedirle la cantidad de productos a procesar, el precio de 5 los suma y mostrar el reultado


cantidad=int(input("ingrese la cantidad de productos: "))

total=0
i=0

while i < int(cantidad):
    valor=int(input("ingrese el precio del producto " ": "))
    total = total + valor
    i = i + 1
print("El valor total es:", total)