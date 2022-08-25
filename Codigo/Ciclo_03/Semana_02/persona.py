class Persona:
    def __init__(self,nombre,edad):
        self.__nombre=nombre
        self.__edad=edad

    def getnombre(self):
        return self.__nombre

    def getedad(self):
        return self.__edad

    def setnombre(self,nombre):
        self.__nombre=nombre

    def setedad(self,edad):
        self.__edad=edad

    def computacionEdad(self):
        if self.__edad > 18:
            return "es mayor de edad"
        else:
            return "Es menor de edad"