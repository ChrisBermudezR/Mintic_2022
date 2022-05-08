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
    if(i in FS_Armas):
          Puntos_FS += 1
    if(i in VG_Armas):
          Puntos_VG += 1
    if(Puntos_VG>Puntos_FS):
        print("V",end="")
    elif (Puntos_FS>Puntos_VG):
        print("F",end="")
    else:
        print("≈",end="")
