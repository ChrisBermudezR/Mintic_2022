from pickle import FALSE, TRUE
opcion=int(input("Ingrese la opción que desea. \n (1) Anadir cliente, \n (2) Eliminar cliente, \n (3) Mostrar cliente. \n (4) Listar todos los clientes. \n (5) Listar clientes preferentes. \n (6) Terminar.\n Escriba su opción: "))
datosCliente={}
if opcion == 1:
    nombre=(str(input("Ingrese el nombre del cliente: ")))
    direccion=(str(input("Ingrese la dirección del cliente: ")))
    telefono=(str(input("Ingrese el teléfono del cliente: ")))
    correo=(str(input("Ingrese el correo del cliente: ")))
    Datopreferente=(int(input("Si el cliente es preferente digite (1) si no lo es digite (0): ")))
    if Datopreferente == 1:
        preferente=TRUE
    else:
        preferente=FALSE
    datosCliente={"Nombre": nombre, "Dirección": direccion, "Teléfono": telefono, "Correo":correo, "Preferente": preferente}
    NIF=int(input("Ingrese el NIF del cliente: "))
    datosCliente[NIF]= datosCliente
    print(datosCliente)
    print(preferente)
elif opcion == 2:
    clienteBorrado=datosCliente.pop(input("Ingrese ell NIF del cliente que desea borrar: "))
elif opcion ==3:
    consultaCliente=(int(input("Ingrese el NIF del cliente que desea ver: ")))
    print(datosCliente[consultaCliente])
elif opcion ==4:
    print(datosCliente)
elif opcion == 5:
    print(datosCliente)
else:
   print("Gracias. Vuelva pronto")