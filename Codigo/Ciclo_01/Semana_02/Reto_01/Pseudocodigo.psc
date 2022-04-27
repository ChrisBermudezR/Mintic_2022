Algoritmo Fases_Obesidad
	Definir hijo Como Real
	Definir padre Como Entero
	Definir madre Como Entero
	Escribir 'Cuál es el peso del padre en kg: '
	Leer padre
	madre <- 2*padre+4
	hijo <- (madre+padre)/5
	Escribir padre; Escribir madre; Escribir hijo
	Si hijo >= 0 y hijo <= 20 Entonces
		Escribir 'uno'
	SiNo 
		Si hijo >= 21 y hijo <= 40 Entonces
			Escribir 'dos'
		SiNo 
			Si hijo >= 41 y hijo <= 80 Entonces
				Escribir 'tres'
			SiNo 
				Si hijo > 80 Entonces
					Escribir 'cuatro'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
