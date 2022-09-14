from django.db import models
from pickle import TRUE

class Cliente(models.Model):
    documento=models.IntegerField(primary_key=True)
    nombre=models.CharField(max_length=30)
    apellido=models.CharField(max_length=30)
    correo=models.CharField(max_length=20)
    celular=models.CharField(max_length=15)
    
class lineas_de_credito:
    codigo=models.IntegerField(primary_key=True)
    nombre=models.CharField(max_length=30)
    plazoMax=models.IntegerField()
    montomaximo=models.IntegerField()
        
class Credito(models.Model):
    codigo_credito=models.IntegerField(primary_key=True)
    montoprestado=models.IntegerField()
    fecha=models.DateField()
    documento=models.ForeignKey(Cliente, on_delete=models.CASCADE)
    codigo=models.ForeignKey(lineas_de_credito, on_delete=models.CASCADE)