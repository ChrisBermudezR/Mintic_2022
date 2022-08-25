import operacionesMat as om
nu1=int(input("Digite un número "))
nu2=int(input("Digite un número "))

ope=om.OperacionesMatematicas(nu1,nu2)
print(ope.getnumero1())
print(ope.getnumero2())
print(ope.suma())
print(ope.resta())
print(ope.division())
print(ope.multiplicacion())