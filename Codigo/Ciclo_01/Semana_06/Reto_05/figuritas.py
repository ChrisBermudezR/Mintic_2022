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
  
def puedocambiar(a,b):
  cuenta=0
  vacia=[]
  for i in a:
    if (i in b) and (i not in vacia):
      cuenta += 1
  return cuenta