print("Cual es el peso del padre en kg: ")
padre = int(input())
madre = int(2*padre+4)
hijo = int((madre+padre)/5)
print(padre, madre, hijo)
if hijo>=0 and hijo<=20:
		print("uno")
else:
		if hijo>=21 and hijo<=40:
			print("dos")
		else:
			if hijo>=41 and hijo<=80:
				print("tres")
			else:
				if hijo>80:
					print("cuatro")

