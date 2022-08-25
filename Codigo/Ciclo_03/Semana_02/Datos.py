class Datos:
    def __init__(self, documento, nombre, clave, rol):
        self.__documento=documento
        self.__nombre=nombre
        self.clave=clave
        self.rol=rol
    def obtdocumento(self):
        return self.__documento

da=Datos(100, "pepe", "123", "cliente")
#da.__documento=200
print(da.documento)
print(da.nombre)