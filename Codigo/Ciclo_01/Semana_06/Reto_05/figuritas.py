def tipodefigurita(a):
  vacia=[]
  for i in a:
    if i not in vacia:
      vacia.append(i)
  return vacia

def mefaltandeltipodefigurita(a,b,c):
  vacia=[]
  for i in a:
    if b[i] == c:
      vacia.append(i)
  return vacia
  
def notengo(a,b):
  vacia=[]
  for i in a:
    if (i not in b) and (i not in vacia):
      vacia.append(i)
  return vacia
  
def puedocambiar(a, b):
  vacia = []
  lista1 = notengo(a, b)
  lista2 = notengo(b, a)
  if len(lista1) < len(lista2):
    return len(lista1)
  else:
    return len(lista2)