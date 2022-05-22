n=int(input())
sco=input()
a=[]
for i in range(n):
    a.insert(i,float(sco.split()[i]))
maxsco=max(a)
for i in range(n):
    a[i]=a[i]/maxsco*100
print(sum(a)/n)