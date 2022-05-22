a=int(input())
b=input()
aa=[]
for i in range(2, -1, -1):
    aa.insert(2-i,a*int(b[i]))
res=0
for i in range(0,3,1):
    print(aa[i])
    res+=int(str(aa[i])+('0'*i))
print(res)