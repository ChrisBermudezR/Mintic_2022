Algoritmo Fases_Obesidad
	Definir Ñoño Como Real
	Definir Quico Como Entero
	Definir Chavo Como Entero
	Escribir 'Cuál es el peso del Chavo en kg: '
	Leer Chavo
	Quico <- 2*Chavo+4
	Ñoño <- (Quico+Chavo)/5
	Escribir Chavo; Escribir Quico; Escribir Ñoño
	Si Ñoño >= 0 y Ñoño <= 20 Entonces
		Escribir 'uno'
	SiNo 
		Si Ñoño >= 21 y Ñoño <= 40 Entonces
			Escribir 'dos'
		SiNo 
			Si Ñoño >= 41 y Ñoño <= 80 Entonces
				Escribir 'tres'
			SiNo 
				Si Ñoño > 80 Entonces
					Escribir 'cuatro'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo