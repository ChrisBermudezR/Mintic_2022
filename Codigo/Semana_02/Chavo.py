# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	nono = float()
	quico = int()
	chavo = int()
	print("Cuál es el peso del Chavo en kg: ")
	chavo = int(input())
	quico = 2*chavo+4
	nono = (quico+chavo)/5
	print(chavo)
	print(quico)
	print(nono)
	if nono>=0 and nono<=20:
		print("uno")
	else:
		if nono>=21 and nono<=40:
			print("dos")
		else:
			if nono>=41 and nono<=80:
				print("tres")
			else:
				if nono>80:
					print("cuatro")

