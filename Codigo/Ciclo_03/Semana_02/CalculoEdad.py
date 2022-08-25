import persona as ps

nombre = input("Digite su nombre: ")
edad = int(input("Digite su edad: "))

persona = ps.Persona(nombre, edad)
print(persona.getedad(), persona.getnombre())
print(persona.computacionEdad())