import random # se importa la librería de python random
#Selecciones
lambetazo = ["Colombianos y queridos","Mi querido pueblo y mis queridos", "Distinguidísimos y amadísimos", "Honorables y queridísimos", "Estimados y benignísimos", "Respetados y bondadosos"]    # se definen las listas
marranos = ["olvidados por la élite,", "conciudadanos,", "amigos,", "coterraneos,", "compatriotas,", "electores," ]
condicion = ["durante nuestro mandato", "en mi próximo período de gobierno", "durante el gobierno del pueblo","en estos próximo cuatro años","en el gobierno del orden", "en la implementación de la verdadera democracia"  ] 
compromiso = ["vamos a derrotar a", "vamos a opacar a", "vamos a sepultar a", "venceremos con el amor a", "reestructurarémos el país para mejorar a", "harémos pagar a"]
ilusion = ["la violencia que nos acaba y", "la economía mediocre y", "las élites que nos oprimen y", "las mafias corruptas y", "la falta de democrácia y", "los delincuentes en la política y las calles y" ]
promesa = ["mejoraré la economía empobrecida para", "trabajaré muy duro por", "me esforzaré con mi alma y mi amor por", "me entregaré en cuerpo y alma por", "uniré a todos los partidos y fuerzas politicas para trabajar por", "lucharemos incansablemente y a cada instante de mi gobierno por"]
beneficio_pop = ["la educación", "los niños pobres y los olvidados", "la paz", "el futuro", "la salud maltrecha","la economía"]
votos=["del país.", "del pueblo.", "de la ciudadanía olvidada.", "de la nación.","de todos y cada uno de ustedes.","de mis queridos colombianos."  ]

#Resultado
lambetazo_sel = random.choice(lambetazo)    
marranos_sel = random.choice(marranos) 
condicion_sel = random.choice(condicion)  
compromiso_sel = random.choice(compromiso) 
ilusion_sel = random.choice(ilusion) 
promesa_sel = random.choice(promesa) 
beneficio_pop_sel= random.choice(beneficio_pop) 
votos_sel= random.choice(votos) 

#discurso
print(lambetazo_sel +  " " + marranos_sel  + " " + condicion_sel  + " " +  compromiso_sel  + " " + ilusion_sel + " " +  promesa_sel + " " +  beneficio_pop_sel  + " " + votos_sel)