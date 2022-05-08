numeros1=[2,3,4]
numeros2=[2,3,4]


acum=0
acum2=0
acum3=0
for i in numeros1: 
  for j in numeros2:
    if (i == j):
      acum +=1

for i in numeros1: 
  for j in numeros2:
    if (i == j):
      acum2 +=1

for i in numeros1: 
  for j in numeros2:
    if (i == j):
      acum3 +=1

print(acum)
print(acum2)
print(acum3)