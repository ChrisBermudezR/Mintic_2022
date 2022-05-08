VG=str(input("Inserta el arma del equipo Vampiric Ghosts: "))   
FS=str(input("Inserta el arma del Frenzy Shooters: "))
reloj =str(input("El juez decide que la mejor arma es: "))

VG_Armas=list(VG)
FS_Armas=list(FS)
reloj_Set=list(reloj)
#Inicializa acumuladores de puntaje para cada equipo
Puntos_VG=0
Puntos_FS=0

for i in reloj_Set:
    for y in FS_Armas:
      if(i==y):
          Puntos_FS += 1

for i in reloj_Set:
    for y in VG_Armas:
      if(i==y):
          Puntos_VG += 1



print(Puntos_VG)
print(Puntos_FS)