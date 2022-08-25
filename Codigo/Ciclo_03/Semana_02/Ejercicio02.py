def operacionesMatematicas():
    while True:
        print("Que operación desea realizar?")
        print("1. Suma")
        print("2. Resta")
        print("3. Multiplicación")
        print("4. División")
        print("5. Salir")
        opc=int(input(print("Elija una opción: ")))
        if opc ==1:
            num1= int(input("Digite un número: "))
            num2= int(input("Digite un número: "))
            print(f'{num1}+{num2}={num1+num2}')

        elif opc==2:
            num1= int(input("Digite un número: "))
            num2= int(input("Digite un número: "))
            print(f'{num1}-{num2}={num1-num2}')

        elif opc==3:
            num1= int(input("Digite un número: "))
            num2= int(input("Digite un número: "))
            print(f'{num1}*{num2}={num1*num2}')

        elif opc==4:
            num1= int(input("Digite un número: "))
            num2= int(input("Digite un número: "))
            print(f'{num1}/{num2}={num1/num2}')
            
        else:
            break