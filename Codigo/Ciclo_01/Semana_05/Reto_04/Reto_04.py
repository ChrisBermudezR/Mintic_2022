import json
diccionarios=input("Introduzca el diccionario de valores de las láminas")
laminas=input("Introduzca el código de las láminas que quiere adquirir: ")
#trans_JSON=json.loads(diccionarios)
#precio=0
claves_dicc=list(diccionarios.keys())

for i in claves_dicc:
  if i == laminas:
      print("Verdad")
  else:
      print("Mentira")