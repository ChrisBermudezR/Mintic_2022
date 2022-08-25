class OperacionesMatematicas:

    def __init__(self,num1,num2):
        self.__numero1=num1
        self.__numero2=num2
    
    def getnumero1(self):
        return self.__numero1

    def getnumero2(self):
        return self.__numero2

    def setnumero1(self,n1):
        self.__numero1=n1

    def setnumero2(self,n2):
        self.__numero2=n2

    def suma(self):
        return self.__numero1+self.__numero2
    def resta(self):
        return self.__numero1-self.__numero2
    def division(self):
        return self.__numero1/self.__numero2
    def multiplicacion(self):
        return self.__numero1*self.__numero2






    