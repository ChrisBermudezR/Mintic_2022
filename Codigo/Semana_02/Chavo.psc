Algoritmo Fases_Obesidad
	Definir �o�o Como Real
	Definir Quico Como Entero
	Definir Chavo Como Entero
	Escribir 'Cu�l es el peso del Chavo en kg: '
	Leer Chavo
	Quico <- 2*Chavo+4
	�o�o <- (Quico+Chavo)/5
	Escribir Chavo; Escribir Quico; Escribir �o�o
	Si �o�o >= 0 y �o�o <= 20 Entonces
		Escribir 'uno'
	SiNo 
		Si �o�o >= 21 y �o�o <= 40 Entonces
			Escribir 'dos'
		SiNo 
			Si �o�o >= 41 y �o�o <= 80 Entonces
				Escribir 'tres'
			SiNo 
				Si �o�o > 80 Entonces
					Escribir 'cuatro'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo