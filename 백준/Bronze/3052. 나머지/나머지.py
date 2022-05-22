a=[]
for i in range(10):
    a.insert(i,int(input())%42)
a=set(a)
print(len(a))